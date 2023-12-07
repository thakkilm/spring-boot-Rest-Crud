package com.mahesh.springboot.cruddemo.dao;

import com.mahesh.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
