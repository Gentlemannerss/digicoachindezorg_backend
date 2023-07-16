package com.digicoachindezorg.digicoachindezorg_backend.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = {
            RecordNotFoundException.class,
            AlreadyExistsException.class,
            IndexOutOfBoundsException.class,
            InvalidPasswordException.class,
            ToManyCharException.class,
            BadRequestException.class,
            UserNotFoundException.class,
            BadCredentialsException.class
    })
    public ResponseEntity<Object> handleException(RuntimeException exception) {
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR; // Default status for unhandled exceptions

        if (exception instanceof RecordNotFoundException || exception instanceof IndexOutOfBoundsException) {
            status = HttpStatus.NOT_FOUND;
        } else if (exception instanceof AlreadyExistsException) {
            status = HttpStatus.CONFLICT;
        } else if (exception instanceof InvalidPasswordException) {
            status = HttpStatus.BAD_REQUEST;
        } else if (exception instanceof ToManyCharException) {
            status = HttpStatus.BAD_REQUEST;
        } else if (exception instanceof BadRequestException) {
            status = HttpStatus.BAD_REQUEST;
        } else if (exception instanceof UserNotFoundException) {
            status = HttpStatus.BAD_REQUEST;
        } else if (exception instanceof BadCredentialsException) {
            status = HttpStatus.BAD_REQUEST;
        }

        return new ResponseEntity<>(exception.getMessage(), status);
    }
}