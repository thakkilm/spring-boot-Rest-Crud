package com.mahesh.springboot.cruddemo.dao;

import com.mahesh.springboot.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    EntityManager entityManager;

    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {

        TypedQuery<Employee> theQuery=entityManager.createQuery("from Employee",Employee.class);
        List<Employee> employees=theQuery.getResultList();
        return employees;
    }

    @Override
    public Employee findByID(int id) {
        Employee employee=entityManager.find(Employee.class,id);
        return employee;
    }
}
