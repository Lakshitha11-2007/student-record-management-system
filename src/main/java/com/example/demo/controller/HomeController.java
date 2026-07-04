package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }

    @GetMapping("/add-student")
    public String addStudent() {
        return "add-student";
    }

    @GetMapping("/view-students")
    public String viewStudents() {
        return "view_students";
    }

    @GetMapping("/update-student")
    public String updateStudent() {
        return "update-student";
    }

    @GetMapping("/delete-student")
    public String deleteStudent() {
        return "delete-student";
    }

    @GetMapping("/attendance")
    public String attendance() {
        return "attendance";
    }

    @GetMapping("/view-attendance")
    public String viewAttendance() {
        return "view-attendance";
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/";
    }
}