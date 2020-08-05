package dao;

import com.jay.dao.StudentMapper;
import com.jay.dao.TeacherMapper;
import com.jay.pojo.Student;
import com.jay.pojo.Teacher;
import com.jay.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {

    public static void main(String[] args) {

        SqlSession sqlSession = MybatisUtil.getSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        Teacher mapperTeacher = mapper.getTeacher(1);

        System.out.println(mapperTeacher);

        sqlSession.close();


    }

    @Test
    public void testGetStudent(){

        SqlSession sqlSession = MybatisUtil.getSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> studentList = mapper.getStudent();

        for (Student student : studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }

}
