package com.example.timetable.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CustomPersonException extends Exception {
    private final String message;
}
