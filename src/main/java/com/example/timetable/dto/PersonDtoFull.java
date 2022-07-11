package com.example.timetable.dto;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(description = "Пользователь все поля")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDtoFull {
    private int id;
    private String name;
    private String username;
}
