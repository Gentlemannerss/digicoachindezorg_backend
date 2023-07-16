package com.digicoachindezorg.digicoachindezorg_backend.exceptions;

public class RecordNotFoundException extends RuntimeException {
    public RecordNotFoundException(String message) {
        super(message);
    }
}
