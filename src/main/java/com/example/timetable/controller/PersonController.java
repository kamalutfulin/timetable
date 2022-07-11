package com.example.timetable.controller;

import com.example.timetable.dto.PersonDtoFull;
import com.example.timetable.dto.PersonDtoShort;
import com.example.timetable.exception.CustomPersonException;
import com.example.timetable.service.PersonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Api("/timetable")
@RequestMapping("/timetable")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/person/")
    public ResponseEntity<PersonDtoFull> addPerson(
            @ApiParam(
                    value = "Новый пользователь",
                    required = true,
                    type = "com.example.timetable.dto.personDto"
            )
            @Valid @RequestBody PersonDtoShort personDtoShort) throws CustomPersonException {
        return new ResponseEntity(personService.addPerson(personDtoShort), HttpStatus.OK);
    }

}
