package com.example.arrays_hw_springboot.exceptions;

public class EmployeeAlreadyAddedException extends RuntimeException {

    public EmployeeAlreadyAddedException (String message) {
        super(message);
    }

}
