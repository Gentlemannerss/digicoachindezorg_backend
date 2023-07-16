package com.digicoachindezorg.digicoachindezorg_backend.exceptions;

public class ToManyCharException extends RuntimeException {
    public ToManyCharException(String message) {
        super(message);
    }
}
