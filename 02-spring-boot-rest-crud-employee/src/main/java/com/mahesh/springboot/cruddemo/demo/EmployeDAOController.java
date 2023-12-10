package com.mahesh.springboot.cruddemo.demo;

import com.mahesh.springboot.cruddemo.entity.Employee;
import com.mahesh.springboot.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/employees/{id}")
    public List<Employee> deleteById(@PathVariable int id){
          employeeService.deleteById(id);
          return  employeeService.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id){

            return  employeeService.findByID(id);

    }

    @PostMapping("/employees")
    public  Employee save(@RequestBody Employee theEmployee){
//        int tempId=5;
//        Employee employee=new Employee(tempId,"Prasad","Kadiyala","Chaitu@gmail.com");
        employeeService.save(theEmployee);
        return  theEmployee;
    }
}
