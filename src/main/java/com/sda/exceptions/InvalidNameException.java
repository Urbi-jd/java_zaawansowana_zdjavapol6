package com.sda.exceptions;

class InvalidNameException extends RuntimeException {
    private final String invalidName;

    InvalidNameException(String invalidName) {
        super(String.format("Name [%s] is invalid.", invalidName));
        this.invalidName = invalidName;
    }

    public String getInvalidName() {
        return invalidName;
    }

}
