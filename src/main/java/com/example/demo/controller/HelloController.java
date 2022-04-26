package com.example.demo.controller;

import com.example.demo.bean.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    //JdbcTemplate连接数据库
/*
    @Autowired
    @Qualifier(value = "studentService")
    private StudentService studentService;

    //http://localhost:8081/SearchStudnets
    @RequestMapping("/SearchStudnets")
    public String SearchStudnetsList() {
        //studentService.CreateService();
        List<Map<String,Object>> list = studentService.FindStudentList();
        for (Map stu:list){
            System.out.println(stu.toString());
            //System.out.println(stu.get("StudentsId"));
        }
        return "ok";
    }

    //http://localhost:8081/AddStudent
    @RequestMapping("/AddStudent")
    public String AddStudent(){
        Student stu = new Student();
        stu.setStudentName("张悠然4");
        stu.setStudentAge("22");
        studentService.AddStudent(stu);
        System.out.println(stu.getStudentsId());
        return "ok";
    }

    //http://localhost:8081/DeleteStudentById
    @RequestMapping("/DeleteStudentById")
    public String DeleteStudentById(){
        studentService.DelStudentById(6);
        return "ok";
    }
*/



    //mybatis连接数据库
    private StudentService studentService;
    @Autowired
    public void HelloController(StudentService studentService){
        this.studentService = studentService;
    }

    //http://localhost:8081/FindAll
    @RequestMapping("/FindAll")
    public List<Student> FindAll(){
        return studentService.FindAll();
    }

}
