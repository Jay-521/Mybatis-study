package com.jay.dao;

import com.jay.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    //根据用户的id查询用户的信息
    User queryUserById(@Param("id") int id);

}
