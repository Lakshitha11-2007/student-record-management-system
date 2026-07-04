package com.example.demo.service;

import com.example.demo.entity.Marks;
import com.example.demo.repository.MarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MarksServiceImpl implements MarksService {

    @Autowired
    private MarksRepository marksRepository;

    @Override
    public Marks saveMarks(Marks marks) {
        return marksRepository.save(marks);
    }

    @Override
    public List<Marks> getAllMarks() {
        return marksRepository.findAll();
    }

    @Override
    public List<Marks> getMarksByStudentId(Long studentId) {
        return marksRepository.findByStudentId(studentId);
    }

    @Override
    public void deleteMarks(Long id) {
        marksRepository.deleteById(id);
    }
}