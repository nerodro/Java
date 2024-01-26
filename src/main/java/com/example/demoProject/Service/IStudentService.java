package com.example.demoProject.Service;

import com.example.demoProject.model.student;

import java.util.List;

public interface IStudentService {
    List<student> findAllStudent();
    student createStudent(student student);
    student getStudent(int id);
    student updateStudent(student student);
    void deleteStudent(int id);
}
