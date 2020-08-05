package com.jay.dao;

import com.jay.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

        //查询全部的用户
        List<User> getUserList();

        //根据ID查询全部的用户
        User getUserById(int id);

        //insert(插入)一个用户
        int addUser(User user);

        //修改用户
        int updateUser(User user);

        //删除用户
        int deleteUser(int id);

        //使用limit分页
        List<User> getUserByLimit(Map<String,Integer> map);

}
