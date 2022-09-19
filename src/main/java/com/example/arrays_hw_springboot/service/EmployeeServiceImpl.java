package com.example.arrays_hw_springboot.service;

import com.example.arrays_hw_springboot.domain.Employee;
import com.example.arrays_hw_springboot.exceptions.EmployeeAlreadyAddedException;
import com.example.arrays_hw_springboot.exceptions.EmployeeNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service

public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employees = new ArrayList<>(Arrays.asList(
            new Employee("Александр", "Клепов"),
            new Employee("Дмитрий", "Фролов"),
            new Employee("Дмитрий", "Волосевич"),
            new Employee("Анатолий", "Карпов"),
            new Employee("Иван1", "Иванов"),
            new Employee("Иван2", "ВторойИванов"),
            new Employee("Иван3", "ТретийИванов")
    ));

    @Override
    public String printAllEmployees() {
      return employees.toString();
    }

    @Override
    public boolean remove(String firstName, String lastName) throws EmployeeNotFoundException {
        Employee forRemove = new Employee(firstName, lastName);
        if (employees.remove(forRemove)) {
            return true;
        }
        throw new EmployeeNotFoundException("Такой сотрудник не найдем!");
    }


    @Override
    public boolean add(String firstName, String lastName) throws EmployeeAlreadyAddedException {
        Employee toAdd = new Employee(firstName, lastName);
        if (employees.contains(toAdd)) {
            throw new EmployeeAlreadyAddedException("Такой сотрудник уже есть в базе!");
        }
        return employees.add(toAdd);
    }


    @Override
    public Employee find(String firstName, String lastName) throws EmployeeNotFoundException {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getFirstName().equals(firstName) && employees.get(i).getLastName().equals(lastName)) {
                return employees.get(i);
            }
        }
        throw new EmployeeNotFoundException("Такой сотрудник не найдем!");
    }

}



