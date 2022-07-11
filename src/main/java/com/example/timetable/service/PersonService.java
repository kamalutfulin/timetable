package com.example.timetable.service;

import com.example.timetable.dto.PersonDtoFull;
import com.example.timetable.dto.PersonDtoShort;
import com.example.timetable.exception.CustomPersonException;

public interface PersonService {
    PersonDtoFull addPerson(PersonDtoShort personDtoShort) throws CustomPersonException;
}
