package com.example.demo.controller;

import com.example.demo.entity.Marks;
import com.example.demo.service.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/marks")
@CrossOrigin(origins = "*")
public class MarksController {

    @Autowired
    private MarksService marksService;

    @PostMapping("/add")
    public Marks addMarks(@RequestBody Marks marks) {
        return marksService.saveMarks(marks);
    }

    @GetMapping("/all")
    public List<Marks> getAllMarks() {
        return marksService.getAllMarks();
    }

    @GetMapping("/student/{studentId}")
    public List<Marks> getByStudentId(@PathVariable Long studentId) {
        return marksService.getMarksByStudentId(studentId);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMarks(@PathVariable Long id) {
        marksService.deleteMarks(id);
        return "Deleted successfully";
    }
}