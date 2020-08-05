package com.jay.pojo;


import lombok.Data;

import java.util.Date;

@Data
public class Blog {

    private String id;
    private String title;
    private String author;
    private Date creatTime;
    private int views;

}
