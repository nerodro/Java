package com.example.demoProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int age;
    private String email;
}
