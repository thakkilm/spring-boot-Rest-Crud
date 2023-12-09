package com.mahesh.springboot.cruddemo.dao;

import com.mahesh.springboot.cruddemo.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface EmployeeDAO {

    List<Employee> findAll();
    Employee findByID(int id);
    Employee save(Employee employee);
}
