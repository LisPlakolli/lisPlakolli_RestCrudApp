package com.mthree.StudentDB.controller;

import com.mthree.StudentDB.entity.Student;
import com.mthree.StudentDB.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController tells Spring that this class is the controller and will handle HTTP requests.
@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //This POST requests adds a student to the table
    @PostMapping
    public Student addNewStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    //This GET request shows all the students in the table
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    //This GET request shows a student based on the passed ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    //This DELETE request removes a student from the table
    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }

    //This PUT request updates a student in the table
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
        return studentService.updateStudent(id, updatedStudent);
    }
}
