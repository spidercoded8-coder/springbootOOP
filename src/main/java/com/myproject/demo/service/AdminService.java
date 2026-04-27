package com.myproject.demo.service;

import com.myproject.demo.model.AdminUser;
import com.myproject.demo.repository.AdminRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    private final AdminRepository repo;

    public AdminService(AdminRepository repo) {
        this.repo = repo;
    }

    public List<AdminUser> getAll() {
        return repo.findAll();
    }

    public void save(AdminUser user) {
        repo.save(user);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}