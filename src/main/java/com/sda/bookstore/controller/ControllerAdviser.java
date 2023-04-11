package com.sda.bookstore.controller;

import com.sda.bookstore.exception.AuthorException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ControllerAdviser extends ResponseEntityExceptionHandler {

    public ResponseEntity<Object> handleAuthorException(AuthorException authorException) {

        Map<String, Object> responseBody = new HashMap<>();
        responseBody.put("timestamp", LocalDateTime.now());
        responseBody.put("error message", authorException.getMessage());

        return new ResponseEntity<>(responseBody, HttpStatus.NOT_ACCEPTABLE);

    }
}
