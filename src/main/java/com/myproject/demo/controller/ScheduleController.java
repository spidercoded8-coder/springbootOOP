package com.myproject.demo.controller;

import com.myproject.demo.model.*;
import com.myproject.demo.service.ScheduleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ScheduleController {

    private final ScheduleService service;

    public ScheduleController(ScheduleService service) {
        this.service = service;
    }

    @GetMapping("/schedule")
    public String schedule(Model model) {
        model.addAttribute("tasks", service.getTasks());
        model.addAttribute("notices", service.getNotices());
        return "schedule";
    }

    @PostMapping("/addTask")
    public String addTask(Task t) {
        service.saveTask(t);
        return "redirect:/schedule";
    }

    @GetMapping("/deleteTask/{id}")
    public String deleteTask(@PathVariable Long id) {
        service.deleteTask(id);
        return "redirect:/schedule";
    }

    @PostMapping("/addNotice")
    public String addNotice(Notice n) {
        service.saveNotice(n);
        return "redirect:/schedule";
    }
}