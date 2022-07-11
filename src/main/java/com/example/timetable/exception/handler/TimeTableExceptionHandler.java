package com.example.timetable.exception.handler;

import com.example.timetable.exception.CustomMeetingException;
import com.example.timetable.exception.CustomPersonException;
import com.example.timetable.exception.response.ErrorResponse;
import javassist.NotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.security.auth.message.AuthException;

import static java.time.LocalDateTime.now;
import static org.springframework.http.HttpStatus.*;


@RestControllerAdvice
public class TimeTableExceptionHandler {
    @ExceptionHandler(CustomMeetingException.class)
    @ResponseStatus(BAD_REQUEST)
    public ErrorResponse handleValidationException(CustomMeetingException customMeetingException) {
        return ErrorResponse.builder()
                .message(customMeetingException.getMessage())
                .status(BAD_REQUEST)
                .timestamp(now())
                .build();
    }

    @ExceptionHandler(CustomPersonException.class)
    @ResponseStatus(BAD_REQUEST)
    public ErrorResponse handleValidationException(CustomPersonException customMeetingException) {
        return ErrorResponse.builder()
                .message(customMeetingException.getMessage())
                .status(BAD_REQUEST)
                .timestamp(now())
                .build();
    }

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(NOT_FOUND)
    public ErrorResponse handleNotFoundException(NotFoundException notFoundException) {
        return ErrorResponse.builder()
                .message(notFoundException.getMessage())
                .status(NOT_FOUND)
                .timestamp(now())
                .build();
    }

    @ExceptionHandler(AuthException.class)
    @ResponseStatus(UNAUTHORIZED)
    public ErrorResponse handleNotFoundException(AuthException authException) {
        return ErrorResponse.builder()
                .message(authException.getMessage())
                .status(UNAUTHORIZED)
                .timestamp(now())
                .build();
    }
}

