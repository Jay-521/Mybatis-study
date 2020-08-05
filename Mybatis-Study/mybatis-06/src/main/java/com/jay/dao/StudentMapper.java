package com.jay.dao;

import com.jay.pojo.Student;

import java.util.List;

public interface StudentMapper {

    //查询所有的学生信息，并找出对应的老师
    List<Student> getStudent();
}
