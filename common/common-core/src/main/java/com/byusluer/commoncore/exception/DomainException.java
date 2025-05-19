package com.byusluer.commoncore.exception;

public class DomainException extends BaseException{
    protected DomainException(String message) {
        super(message);
    }

    protected DomainException(String message, Throwable cause) {
        super(message, cause);
    }
}
