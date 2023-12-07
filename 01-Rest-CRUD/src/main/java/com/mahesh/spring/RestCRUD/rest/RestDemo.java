package com.mahesh.spring.RestCRUD.rest;

import com.mahesh.spring.RestCRUD.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestDemo {
private List<Student> theStudents;

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World";
    }
}
