package com.example.timetable.configuration;

import com.example.timetable.dto.MeetingDto;
import com.example.timetable.dto.PersonDtoFull;
import com.example.timetable.dto.PersonDtoShort;
import com.example.timetable.entity.Meeting;
import com.example.timetable.entity.Person;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;

public class OrikaMapperConfig extends ConfigurableMapper {

    protected void configure(MapperFactory factory) {

        factory.classMap(Person.class, PersonDtoShort.class)
                .byDefault()
                .register();

        factory.classMap(Person.class, PersonDtoFull.class)
                .byDefault()
                .register();

        factory.classMap(Meeting.class, MeetingDto.class)
                .byDefault()
                .register();
    }
}
