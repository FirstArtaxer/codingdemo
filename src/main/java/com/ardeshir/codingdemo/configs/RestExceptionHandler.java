package com.ardeshir.codingdemo.configs;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler(value = { Exception.class })
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String unknownException(Exception exception) {
        return exception.getMessage();
    }
}
