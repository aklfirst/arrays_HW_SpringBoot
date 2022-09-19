package com.example.arrays_hw_springboot.service;

import com.example.arrays_hw_springboot.domain.Employee;

public interface EmployeeService {

    public String printAllEmployees();

    public Employee find(String firstName, String lastName);
    public boolean add(String firstName, String lastName);

    public boolean remove(String firstName, String lastName);


}
