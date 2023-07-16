package com.digicoachindezorg.digicoachindezorg_backend.exceptions;

public class AlreadyExistsException extends RuntimeException {
    public AlreadyExistsException(String message) {
        super(message);
    }
}
