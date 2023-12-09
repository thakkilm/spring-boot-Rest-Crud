package com.mahesh.springboot.cruddemo.demo;

import com.mahesh.springboot.cruddemo.dao.EmployeeDAO;
import com.mahesh.springboot.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeDAOController {

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeDAOController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return  employeeDAO.findAll();
    }
}
