package com.example.arrays_hw_springboot.controller;

import com.example.arrays_hw_springboot.domain.Employee;
import com.example.arrays_hw_springboot.service.EmployeeService;
import com.example.arrays_hw_springboot.service.EmployeeServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employees/")

public class EmployeeController {

    private final EmployeeService employeeService;

@GetMapping
    public String welcome () {return "<h1>Добро пожаловать!</h1>";}


    @GetMapping("/printAll")
    public String printAllEmployees() {
        return employeeService.printAllEmployees();
    }

    @GetMapping("/find")
    public Employee findEmployee(
            @RequestParam("name") String name,
            @RequestParam("lastname") String lastName
    ) {
        return employeeService.find(name, lastName);
    }

    @GetMapping("/remove")
    public boolean removeEmployee(
            @RequestParam("name") String name,
            @RequestParam("lastname") String lastName
    ) {
        return employeeService.remove(name, lastName);
    }

    @GetMapping("/add")
    public boolean addEmployee(
            @RequestParam("name") String name,
            @RequestParam("lastname") String lastName
    ) {
        return employeeService.add(name, lastName);
    }

}
