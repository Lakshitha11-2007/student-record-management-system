package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Save Student
    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student) {
        studentService.saveStudent(student);
        return "redirect:/students/view-students";
    }

    // View Students Page
    @GetMapping("/view-students")
    public String viewStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "view_students";
    }

    // Get All Students (JSON)
    @GetMapping("/all")
    @ResponseBody
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // Update Student
    @PostMapping("/update")
    public String updateStudent(@ModelAttribute Student student) {
        studentService.updateStudent(student.getStudentId(), student);
        return "redirect:/students/view-students";
    }

    // Delete Student
    @PostMapping("/delete")
    public String deleteStudent(@RequestParam Long studentId) {
        studentService.deleteStudent(studentId);
        return "redirect:/students/view-students";
    }
}