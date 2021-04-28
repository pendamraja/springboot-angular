package com.employee.database.controller;

import com.employee.database.model.Employee;
import com.employee.database.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8080")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/createEmployee")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee)
    {
        try {
            Employee employee1 = employeeRepository.save(employee);
            return new ResponseEntity<>(employee1, HttpStatus.CREATED);
        }
        catch (Exception e)
        {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping("/getEmployee")
    public List<Employee> getEmployeeDetails(){

           List<Employee> employeeList = employeeRepository.findAll();

            return employeeList;
        }
        }
