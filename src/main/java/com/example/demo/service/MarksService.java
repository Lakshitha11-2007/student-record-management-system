package com.example.demo.service;

import com.example.demo.entity.Marks;
import java.util.List;

public interface MarksService {
    Marks saveMarks(Marks marks);
    List<Marks> getAllMarks();
    List<Marks> getMarksByStudentId(Long studentId);
    void deleteMarks(Long id);
}