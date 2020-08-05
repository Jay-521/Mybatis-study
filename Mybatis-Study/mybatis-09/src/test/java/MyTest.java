import com.jay.dao.UserMapper;
import com.jay.pojo.User;
import com.jay.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {

    @Test
    public void test(){

        SqlSession sqlSession = MybatisUtil.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user1 = mapper.queryUserById(1);
        sqlSession.clearCache();//手动清理缓存
        //一级缓存默认开启，不能停止，对一次SqlSession有效 相当于一个map.
        //当一级缓存死亡的时候，二级缓存会开启工作，一级缓存的内容放在了二级缓存中
        User user2 = mapper.queryUserById(1);
        System.out.println(user1);
        System.out.println(user2);
        sqlSession.close();
    }
}

/**
 缓存的顺序：

 用户先从二级缓存中进入

 1 先看二级缓存中有没有
 2 再看一级缓存中有没有
 3 查询数据库，并把查询到的数据放在一级缓存中

 */
