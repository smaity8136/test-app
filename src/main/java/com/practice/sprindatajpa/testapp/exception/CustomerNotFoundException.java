package com.practice.sprindatajpa.testapp.exception;

import java.util.function.Supplier;

public class CustomerNotFoundException extends RuntimeException  {

    private static final long serialVersionUID = 6121074736557869884L;



    private final Error code;

    public CustomerNotFoundException(Error code) {
        super();
        this.code = code;
    }

    public CustomerNotFoundException(String message, Throwable cause, Error code) {
        super(message, cause);
        this.code = code;
    }

    public CustomerNotFoundException(String message, Error code) {
        super(message);
        this.code = code;
    }

    public CustomerNotFoundException(Throwable cause, Error code) {
        super(cause);
        this.code = code;
    }

    public Error getCode() {
        return this.code;
    }


}