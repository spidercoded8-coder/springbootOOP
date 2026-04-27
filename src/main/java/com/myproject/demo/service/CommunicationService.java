package com.myproject.demo.service;

import com.myproject.demo.model.Message;
import com.myproject.demo.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommunicationService {

    private final MessageRepository repo;

    public CommunicationService(MessageRepository repo) {
        this.repo = repo;
    }

    public List<Message> getAll() {
        return repo.findAll();
    }

    public void save(Message msg) {
        repo.save(msg);
    }
}