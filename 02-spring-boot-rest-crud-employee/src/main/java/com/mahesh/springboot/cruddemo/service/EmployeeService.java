package com.mahesh.springboot.cruddemo.service;

import com.mahesh.springboot.cruddemo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {

    public List<Employee> findAll();
    Employee findByID(int id);
    Employee save(Employee employee);
    void deleteById(int id);
}
