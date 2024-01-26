package com.example.demoProject.repository;

import com.example.demoProject.model.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentRepository extends JpaRepository<student, Long> {

    student findById(int id);
}
