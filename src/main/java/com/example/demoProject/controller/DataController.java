package com.example.demoProject.controller;

import com.example.demoProject.Service.StudentService;
import com.example.demoProject.model.student;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
@AllArgsConstructor
public class DataController {

    private final StudentService _service;
    @GetMapping("/getallstudents")
    public List<student> findAllStudent(){
        return  _service.findAllStudent();
    }
    @PostMapping("/create")
    public  student createStudent(@RequestBody student student){
        return _service.createStudent(student);
    }
    @PutMapping("/update")
    public student updateStudent(@RequestBody student student){
        return _service.updateStudent(student);
    }
    @GetMapping("/get/{id}")
    public  student getSingle(int id){
        return _service.getStudent(id);
    }
    @DeleteMapping("/delete")
    public void deleteStudent(int id){
        _service.deleteStudent(id);
    }
}
