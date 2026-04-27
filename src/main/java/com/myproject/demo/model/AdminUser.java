package com.myproject.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class AdminUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String role;
}