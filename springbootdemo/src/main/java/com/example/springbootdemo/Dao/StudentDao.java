package com.example.springbootdemo.Dao;

import com.example.springbootdemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


// DAO层提供了应用程序与数据库之间的操作规范和操作用于数据库的增删改查
@Repository
public interface StudentDao extends JpaRepository<Student,Integer>{     //<实体类，主键的类型>

    //通过名字找到用户
    List<Student> findByNameAndAge(String name,Integer gae);

    //使用sql查询
    @Query(value = "select * from student a where a.name LIKE CONCAT('%',?1,'%') and a.age = ?2",nativeQuery = true)
    List<Student>  findBySQL(String name,Integer age);


}