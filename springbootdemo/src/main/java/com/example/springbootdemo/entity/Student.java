package com.example.springbootdemo.entity;

import javax.naming.Name;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity   //实体
@Table(name = "student")      //数据库表名
public class Student {

    @Id   //主键
    @GeneratedValue(strategy = GenerationType.AUTO)     //代表自增
    private Integer id;
    private String name;
    private Integer age;
    private String sex;

    public Integer getId() {
        return id;
    }

//
//    @NotEmpty(message = "学生姓名不能为空")   //表单验证
//    @Column(length = 20)   //字段长度
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
