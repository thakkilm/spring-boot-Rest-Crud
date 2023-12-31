package com.mahesh.spring.RestCRUD.rest;

import com.mahesh.spring.RestCRUD.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> theStudents;
    @PostConstruct
    public void studentList(){
        theStudents=new ArrayList<Student>();
        theStudents.add(new Student("Mahesh","Thakkilapati"));
        theStudents.add(new Student("Lokesh","Thakkilapati"));
        theStudents.add(new Student("Lavanya","Thakkilapati"));

    }

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return theStudents;
    }

    @GetMapping("/students/{studentId}")
    public Student getAllStudents(@PathVariable int studentId){

        if((studentId>=theStudents.size())||(studentId<0)){
            throw new StudentNotFoundException("Student ID not found -"+studentId);
        }
       return theStudents.get(studentId);
    }

}
