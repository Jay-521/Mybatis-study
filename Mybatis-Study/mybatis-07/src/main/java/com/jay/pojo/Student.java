package com.jay.pojo;


import lombok.Data;
@Data
public class Student {

    private int id;
    private String name;

    //学生需要关联一个老师
    private int tid;

}
