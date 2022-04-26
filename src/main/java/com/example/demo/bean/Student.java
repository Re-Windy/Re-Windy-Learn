package com.example.demo.bean;

public class Student {
    private Integer StudentsId;
    private String StudentName;
    private String StudentAge;

    public Student() {}

    @Override
    public String toString() {
        return "Student{" +
                "StudentsId=" + StudentsId +
                ", StudentName='" + StudentName + '\'' +
                ", StudentAge='" + StudentAge + '\'' +
                '}';
    }

    public String getStudentAge() {
        return StudentAge;
    }

    public Integer getStudentsId() {
        return StudentsId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentAge(String studentAge) {
        StudentAge = studentAge;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public void setStudentsId(Integer studentsId) {
        StudentsId = studentsId;
    }
}
