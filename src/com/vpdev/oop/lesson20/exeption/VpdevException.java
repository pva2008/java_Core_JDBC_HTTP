package com.vpdev.oop.lesson20.exeption;

public class VpdevException extends RuntimeException {

    public VpdevException(String message) {
        super(message);
    }

    public VpdevException(Throwable cause) {
        super(cause);
    }
}