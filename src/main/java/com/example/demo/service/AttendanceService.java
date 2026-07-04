package com.example.demo.service;

import com.example.demo.entity.Attendance;
import java.util.List;

public interface AttendanceService {
    Attendance saveAttendance(Attendance attendance);
    List<Attendance> getAllAttendance();
    List<Attendance> getAttendanceByStudentId(Long studentId);
}