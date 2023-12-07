package com.mahesh.spring.RestCRUD.rest;

public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(String s) {
        super(s);
    }

    public StudentNotFoundException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public StudentNotFoundException(Throwable throwable) {
        super(throwable);
    }
}
