package com.example.springbootdemo.service;

import com.example.springbootdemo.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;


//业务层主要用来处理业务逻辑

public interface StudentService {

    public void addStudent(Student student);
    public void updateStudent(Student student);
    public List<Student> findAllStudent();
    public List<Student> findBySQL(Student student);
    public List<Student> findByNameAndAge(Student student);       //具体实现是在serviceimpl

}
