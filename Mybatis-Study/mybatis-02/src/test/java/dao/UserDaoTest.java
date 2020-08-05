package dao;

import com.jay.dao.UserMapper;
import com.jay.pojo.User;
import com.jay.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void test(){

        //第一步：获取SqlSession的对象
        SqlSession sqlSession = MybatisUtil.getSession();

        //方式1：getMapper
        UserMapper userDao= sqlSession.getMapper(UserMapper.class);
        List<User> userList = userDao.getUserList();


        for (User user : userList) {
            System.out.println(user);
        }

        //关闭SqlSession
        sqlSession.close();

    }


    @Test
    public void  testUserById(){

        SqlSession sqlSession = MybatisUtil.getSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User userById = mapper.getUserById(1);

        System.out.println(userById);

        sqlSession.close();
    }

    //增删改查需要提交事务
    @Test
    public void testAddUser(){

        SqlSession sqlSession = MybatisUtil.getSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.addUser(new User("拉拉","12345",5));

        //提交事务
        sqlSession.commit();

        sqlSession.close();
    }

    //按照id修改用户的信息
    //需要提交事务
    @Test
    public void testUpdateUser(){

        SqlSession sqlSession = MybatisUtil.getSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.updateUser(new User("哇哇","567898",5));

        //提交事务
        sqlSession.commit();

        sqlSession.close();

    }

    //按照ID删除用户的信息
    @Test
    public void testDeleteUser(){

        SqlSession sqlSession = MybatisUtil.getSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.deleteUser(5);

        sqlSession.commit();
        sqlSession.close();

    }
}
