package com.myproject.demo.controller;

import com.myproject.demo.model.AdminUser;
import com.myproject.demo.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AdminController {

    private final AdminService service;

    public AdminController(AdminService service) {
        this.service = service;
    }

    @GetMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("users", service.getAll());
        model.addAttribute("user", new AdminUser());
        return "admin";
    }

    @PostMapping("/addUser")
    public String add(AdminUser u) {
        service.save(u);
        return "redirect:/admin";
    }

    @GetMapping("/deleteUser/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/admin";
    }
}