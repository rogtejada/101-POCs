package com.rogtejada.javaee.poc.exception;

public class DbException extends RuntimeException{
    public DbException(String message) {
        super(message);
    }
}
