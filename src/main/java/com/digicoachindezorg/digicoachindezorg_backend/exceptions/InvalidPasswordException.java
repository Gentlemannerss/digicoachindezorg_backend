package com.digicoachindezorg.digicoachindezorg_backend.exceptions;

public class InvalidPasswordException extends RuntimeException {
    public InvalidPasswordException(String message) {
        super(message);
    }
}