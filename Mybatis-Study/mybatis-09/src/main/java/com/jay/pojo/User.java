package com.jay.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable{
    private String name;
    private String pwd;
    private int id;
}
