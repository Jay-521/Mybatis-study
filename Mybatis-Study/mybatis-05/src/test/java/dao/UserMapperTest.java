package dao;

import com.jay.dao.UserMapper;
import com.jay.pojo.User;
import com.jay.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    @Test
    public void test(){

        SqlSession sqlSession = MybatisUtil.getSession();
        //底层主要应用反射
        //本质是动态代理
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUsers();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void testGetUserById(){

        SqlSession sqlSession = MybatisUtil.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User userById = mapper.getUserById(1);
        System.out.println(userById);
        sqlSession.close();

    }

    @Test
    public void testAddUser(){

        SqlSession sqlSession = MybatisUtil.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.addUser(new User("hello","9876554",10));

        sqlSession.close();

    }

}
