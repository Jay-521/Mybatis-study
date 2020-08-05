import com.jay.dao.TeacherMapper;
import com.jay.pojo.Teacher;
import com.jay.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {

    @Test
    public void testTeacher(){

        SqlSession sqlSession = MybatisUtil.getSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();


    }
}
