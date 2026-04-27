package com.myproject.demo.controller;

import com.myproject.demo.model.Document;
import com.myproject.demo.service.DocumentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DocumentController {

    private final DocumentService service;

    public DocumentController(DocumentService service) {
        this.service = service;
    }

    @GetMapping("/docs")
    public String docs(Model model) {
        model.addAttribute("docs", service.getAll());
        return "documentation";
    }

    @PostMapping("/addDoc")
    public String add(Document d) {
        service.save(d);
        return "redirect:/docs";
    }

    @GetMapping("/deleteDoc/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/docs";
    }

    @GetMapping("/editDoc/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("doc", service.getById(id));
        return "editDocument";
    }

    @PostMapping("/updateDoc")
    public String update(Document d) {
        service.save(d);
        return "redirect:/docs";
    }
}