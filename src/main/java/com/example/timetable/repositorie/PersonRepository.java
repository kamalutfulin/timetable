package com.example.timetable.repositorie;

import com.example.timetable.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {

    Boolean existsPersonByUsername(String username);
}
