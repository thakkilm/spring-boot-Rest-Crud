package com.mahesh.springboot.cruddemo.service;

import com.mahesh.springboot.cruddemo.dao.EmployeeRepository;
import com.mahesh.springboot.cruddemo.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository ;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository ) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> result = employeeRepository.findById(id);
        Employee employee=null;
        if(result.isPresent()){
            employee=result.get();
        }
        return employee;
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override

    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public void updateById(Employee employee) {
        employeeRepository.save(employee);
    }
}
