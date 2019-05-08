package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.Student;
import com.example.springbootdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



//@RestController 代替 @Controller,省略以后的 @ResponseBody
@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentService studentservice;



    /**
     * 显示所有
     * url:"http://localhost/student/findall"
     *
     * @return
     */
    @RequestMapping(value = "/findall")
    public List<Student> list() {
        return studentservice.findAllStudent();
    }

//
//    /**
//     * 查找 restful 风格
//     * url:"http://localhost/student/findone/1"
//     *
//     * @param id
//     * @return
//     */
//
//    // == @RequestMapping(value = "/findone/{id}", method = RequestMethod.GET)
//    @GetMapping("/findone/{id}")
//    public Student findStudentRestful(@PathVariable("id") Integer id) {
//        return studentservice.findStudent(id);
//    }
//

//    /**
//     * 删除 restful 风格
//     * url:"http://localhost/student/deleteone/4"
//     * 注意无法通过浏览器的链接来模拟检验,可以通过 jquery的 $.ajax方法，并type="delete"
//     *
//     * @param id
//     */
//    // == @RequestMapping(value = "/deleteone/{id}", method = RequestMethod.DELETE)
//    @DeleteMapping("/deleteone/{id}")
//    public void deleteStudentRestful(@PathVariable("id") Integer id) {
//        studentservice.deleteStudent(id);
//    }
//
//
//    /**
//     * 增加 restful 风格
//     * url:"http://localhost/student/addone"
//     * 通过<form>表单模拟验证
//     *
//     * @param student
//     */
//    // == @RequestMapping(value="/addone",method=RequestMethod.POST)
//    @PostMapping("/addone")
//    public void addStudentRestful(Student student) {
//        studentservice.addStudent(student);
//    }
//
//
//    /**
//     * 修改 restful 风格
//     * url:"http://localhost/student/updateone"
//     * 验证：可以通过 jquery的 $.ajax方法，并type="put",同时注意data形式——A=a&B=b&C=c
//     *
//     * @param student
//     */
//    // == @RequestMapping(value="/addone",method=RequestMethod.PUT)
//    @PutMapping("/updateone")
//    public void updateStudentRestful(Student student) {
//        studentservice.updateStudent(student);
//    }




        /**
     * 修改 restful 风格
     * url:"http://localhost/student/updateone"
     * 验证：可以通过 jquery的 $.ajax方法，并type="put",同时注意data形式——A=a&B=b&C=c
     *
     * @param student
     */
    // == @RequestMapping(value="/addone",method=RequestMethod.PUT)
    @RequestMapping(value = "/and",method = RequestMethod.GET)
    public List<Student> findBySQL(Student student) {
        return studentservice.findBySQL(student);
    }


    @RequestMapping(value = "/aaa",method = RequestMethod.GET)
    public List<Student> findByNameAndAge(Student student){
        return studentservice.findByNameAndAge(student);        //controller调用service层
    }


}
