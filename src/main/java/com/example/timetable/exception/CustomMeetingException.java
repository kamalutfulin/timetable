package com.example.timetable.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CustomMeetingException extends Exception {
    private final String message;
}
