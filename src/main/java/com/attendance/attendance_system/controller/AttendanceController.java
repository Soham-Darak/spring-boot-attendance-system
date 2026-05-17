package com.attendance.attendance_system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {


    // Health Check API
    @GetMapping("/status")
    public Map<String, Object> getStatus() {

        return Map.of(
                "status", "Attendance Service Running",
                "service", "Attendance Management System",
                "time", LocalDateTime.now()
        );
    }

    // Attendance Check-In API
    @PostMapping("/checkin")
    public Map<String, Object> checkIn(
            @RequestParam(defaultValue = "Guest") String username) {

        return Map.of(
                "message", "Check-in Successful",
                "username", username,
                "checkInTime", LocalDateTime.now()
        );
    }


    // Simple Browser Testing API
    @GetMapping("/hello")
    public String hello() {

        return "Attendance Management System is Running Successfully";
    }
}