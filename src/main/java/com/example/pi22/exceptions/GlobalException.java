package com.example.pi22.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(Exception.class)
    public ResponseEntity error(Exception e) {

        return  new ResponseEntity( e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
