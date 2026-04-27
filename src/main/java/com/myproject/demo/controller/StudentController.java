package com.myproject.demo.controller;

import com.myproject.demo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/student")
    public String student(Model model) {
        model.addAttribute("categories", service.getGrouped());
        return "student";
    }
}