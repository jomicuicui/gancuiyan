package com.example.springbootdemo.impl;

import java.util.List;

import com.example.springbootdemo.Dao.StudentDao;
import com.example.springbootdemo.entity.Student;
import com.example.springbootdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

   @Override
    public void addStudent(Student student) {
        // TODO Auto-generated method stub
        studentDao.save(student);
    }

    @Override
    public void updateStudent(Student student) {
        // TODO Auto-generated method stub
        studentDao.save(student);
    }

    @Override
    public List<Student> findAllStudent() {
        // TODO Auto-generated method stub
        return studentDao.findAll();

    }

    public List<Student> findBySQL(Student student ){
        List<Student> data = studentDao.findBySQL(student.getName(),student.getAge());
        return data;

    }

    @Override
    public List<Student> findByNameAndAge(Student student){
       return studentDao.findByNameAndAge(student.getName(),student.getAge());     //调用dao层
    }

}
