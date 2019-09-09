package com.rogtejada.poc.app.exception;

public class DbException extends RuntimeException{
    public DbException(String message) {
        super(message);
    }
}
