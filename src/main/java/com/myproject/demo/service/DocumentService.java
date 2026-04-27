package com.myproject.demo.service;

import com.myproject.demo.model.Document;
import com.myproject.demo.repository.DocumentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {

    private final DocumentRepository repo;

    public DocumentService(DocumentRepository repo) {
        this.repo = repo;
    }

    public List<Document> getAll() {
        return repo.findAll();
    }

    public void save(Document d) {
        repo.save(d);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public Document getById(Long id) {
        return repo.findById(id).orElse(null);
    }
}