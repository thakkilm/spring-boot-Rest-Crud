package com.mahesh.spring.RestCRUD.rest;

import com.mahesh.spring.RestCRUD.student.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RestDemo {
private List<Student> theStudents;
    @PostConstruct
    public void studentList(){
        theStudents=new ArrayList<Student>();
        theStudents.add(new Student("Mahesh","Thakkilapati"));
        theStudents.add(new Student("Lokesh","Thakkilapati"));
        theStudents.add(new Student("Lavanya","Thakkilapati"));

    }
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World";
    }
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return theStudents;
    }
}
