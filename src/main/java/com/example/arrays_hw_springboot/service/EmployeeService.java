package com.example.arrays_hw_springboot.service;

import com.example.arrays_hw_springboot.domain.Employee;

import java.util.Collection;

public interface EmployeeService {

    Collection<Employee> printAllEmployees();

    public Employee find(String firstName, String lastName);
    public Employee add(String firstName, String lastName);

    public Employee remove(String firstName, String lastName);


}
