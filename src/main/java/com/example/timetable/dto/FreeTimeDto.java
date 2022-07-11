package com.example.timetable.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@ApiModel(description = "Встреча")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FreeTimeDto {

    @ApiModelProperty(
            notes = "Время начала встречи",
            name = "meetingTimeStart",
            dataType = "java.time",
            example = "2022-07-08 15:00"
    )
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private List<String> meetingTimeStart;


}
