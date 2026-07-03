package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {

    Student saveStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(Long studentId);

    Student updateStudent(Long studentId, Student student);

    void deleteStudent(Long studentId);
}
