package com.jay.dao;

import com.jay.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {

        //查询全部的用户
        //注解简化开发，再项目比较小的时候可以使用注解
        //但是在项目比较大的时候，不建议使用注解
        @Select("select * from user")
        List<User> getUsers();

        //使用注解，通过ID查找用户
        @Select("select * from user where id = #{id}")
        User getUserById(int id);

        //使用注解，插入用户
        @Insert("insert into user(id,name,pwd) values (#{id},#{name},#{pwd})")
        int addUser(User user);

}
