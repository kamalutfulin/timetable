package com.example.timetable.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@ApiModel(description = "Новый пользователь")
@Data
public class PersonDtoShort {

    @ApiModelProperty(
            notes = "Имя пользователя",
            name = "name",
            dataType = "java.lang",
            example = "Игорь"
    )
    @NotBlank
    private String name;
    @ApiModelProperty(
            notes = "Никнейм пользователя",
            name = "username",
            dataType = "java.lang",
            example = "igor228"
    )
    @NotBlank
    private String username;
}
