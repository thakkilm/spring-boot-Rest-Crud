package com.mahesh.springboot.cruddemo.service;

import com.mahesh.springboot.cruddemo.dao.EmployeeDAO;
import com.mahesh.springboot.cruddemo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findByID(int id) {
        return employeeDAO.findByID(id);
    }
}
