package com.example.demo.service;

import com.example.demo.bean.Student;
import com.example.demo.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Component
@Service
@Transactional
public class StudentService {
    //JdbcTemplate连接数据库
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void CreateService(){
        System.out.println("StudentService创建成功");
    }
    public List<Map<String,Object>> FindStudentList(){
        String sql = "SELECT * FROM students";
        List<Map<String,Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }
    public void AddStudent(Student student){
        String sql = "INSERT INTO students (`StudentName`, `StudentAge`) VALUES ( '"
                + student.getStudentName() + "',"+ student.getStudentAge() + ")";
        jdbcTemplate.execute(sql);
    }
    public void DelStudentById(int id){
        String sql = "DELETE FROM students WHERE (`StudentsId` = '" + id + "')";
        jdbcTemplate.execute(sql);
    }






    //mybatis连接数据库
    private StudentDao studentDao;
    @Autowired
    public StudentService (StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public List<Student> FindAll(){
        return studentDao.FindAll();
    }
}
