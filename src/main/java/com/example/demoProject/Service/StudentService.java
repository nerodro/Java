package com.example.demoProject.Service;

import com.example.demoProject.model.student;
import com.example.demoProject.repository.IStudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService implements IStudentService {
    private  final IStudentRepository repository;
    @Override
    public List<student> findAllStudent(){
        return repository.findAll();
    }

    @Override
    public student createStudent(student student) {
        return repository.save(student);
    }

    @Override
    public student getStudent(int id) {
        return repository.findById(id);
    }

    @Override
    public student updateStudent(student student) {
        return repository.save(student);
    }

    @Override
    public void deleteStudent(int id) {
        student student = repository.findById(id);
        repository.delete(student);
    }

}
