package com.mthree.StudentDB.service;

import com.mthree.StudentDB.entity.Student;
import com.mthree.StudentDB.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    /*
     * Returns all students from the database
     */
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    
    /*
     * Retrieves student from the database based on ID
     */
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    /*
     * Adds a student to the database
     */
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    /*
     * Deletes student from the database
     */
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public Student updateStudent(Long id, Student updatedStudent) {
        Student student = studentRepository.findById(id).orElse(null);
        if (student != null) {
            student.setName(updatedStudent.getName());
            student.setFees(updatedStudent.getFees());
            student.setSubName(updatedStudent.getSubName());
            return studentRepository.save(student);
        }
        return null;
    }
}
