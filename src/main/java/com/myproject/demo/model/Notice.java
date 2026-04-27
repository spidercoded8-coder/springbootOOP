package com.myproject.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Notice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;
}