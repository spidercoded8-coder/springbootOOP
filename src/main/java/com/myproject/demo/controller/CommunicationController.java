package com.myproject.demo.controller;

import com.myproject.demo.model.Message;
import com.myproject.demo.service.CommunicationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CommunicationController {

    private final CommunicationService service;

    public CommunicationController(CommunicationService service) {
        this.service = service;
    }

    @GetMapping("/chat")
    public String chat(Model model) {
        model.addAttribute("messages", service.getAll());
        model.addAttribute("msg", new Message());
        return "chat";
    }

    @PostMapping("/chat")
    public String send(Message m) {
        m.setTime(java.time.LocalTime.now().toString());
        service.save(m);
        return "redirect:/chat";
    }
}