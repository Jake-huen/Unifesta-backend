package com.wit.unifesta.exception;

public class UnifestaException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public UnifestaException(String message){
        super(message);
    }
}
