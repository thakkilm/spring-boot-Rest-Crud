package com.mahesh.springboot.cruddemo.demo;

import com.mahesh.springboot.cruddemo.entity.Employee;
import com.mahesh.springboot.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeDAOController {


    private EmployeeService employeeService;

    @Autowired
    public EmployeDAOController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return  employeeService.findAll();
    }

//    @GetMapping("/employees/{id}")
//    public Employee findById(@PathVariable int id){
//        return  employeeService.findByID(id);
//    }

    @GetMapping("/employees/{id}")
    public Employee save(@PathVariable int id){
        if(id==0){
            int tempId=5;
            Employee employee=new Employee(tempId,"Prasad","Kadiyala","Chaitu@gmail.com");
            employeeService.save(employee);
            return  employeeService.findByID(tempId);
        }
        else {
            return  employeeService.findByID(id);

        }
    }
}
