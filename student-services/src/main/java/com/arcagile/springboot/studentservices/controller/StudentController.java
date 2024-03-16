package com.arcagile.springboot.studentservices.controller;

import com.arcagile.springboot.studentservices.model.Student;
import com.arcagile.springboot.studentservices.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    //Get all students
    @GetMapping("/studentsWithDummyData")
    public List<Student> getStudents() {
        List<Student> students = Arrays.asList(
                new Student(1,"Rahul", 16),
                new Student(1,"Sanjana", 25),
                new Student(1,"Venkat", 21)
        );

        return students;
    }

    @GetMapping("/students")
    public List<Student> getStudentsFromDB() {

        return studentRepository.findAll();
    }

    //Create a Student details
    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    //Update a student details by student id
    @PutMapping("/students/{id}")
    public Student updateStudent(@RequestBody Student student, @PathVariable Integer id) {

        //First step : verify student id is available in the database or not, if student id not found through an Exception with custom message
        Student student1 = studentRepository.findById(id).orElseThrow();

        //Second step : map new details to student object
        student1.setName(student.getName());
        student1.setAge(student.getAge());

        //Third step : update new details to the database
        return  studentRepository.save(student1);
    }

    //Delete a student

}
