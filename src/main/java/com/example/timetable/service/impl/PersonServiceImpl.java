package com.example.timetable.service.impl;

import com.example.timetable.configuration.OrikaMapperConfig;
import com.example.timetable.dto.PersonDtoFull;
import com.example.timetable.dto.PersonDtoShort;
import com.example.timetable.entity.Person;
import com.example.timetable.exception.CustomPersonException;
import com.example.timetable.repositorie.PersonRepository;
import com.example.timetable.service.PersonService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;

    private MapperFacade mapperFacade = new OrikaMapperConfig();

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Transactional
    public PersonDtoFull addPerson(PersonDtoShort personDtoShort) throws CustomPersonException {

        Boolean isExist = personRepository.existsPersonByUsername(personDtoShort.getUsername());

        if (isExist) {
            throw new CustomPersonException(String.format("Пользователь с никнеймом %s уже есть", personDtoShort.getUsername()));
        }

        Person person = Person.builder()
                .name(personDtoShort.getName())
                .username(personDtoShort.getUsername())
                .build();
        try {
            personRepository.save(person);
        } catch (Exception ex) {
            throw new CustomPersonException("не удалось сохранить пользователя" + person.toString());
        }

        return mapperFacade.map(person, PersonDtoFull.class);
    }

}
