import com.jay.dao.BlogMapper;
import com.jay.pojo.Blog;
import com.jay.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class Mytest {

    @Test
    public void testqueryBlogIf() {

        SqlSession sqlSession = MybatisUtil.getSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap hashMap = new HashMap();
        //hashMap.put("title","Java如此简单");
        hashMap.put("author", "狂神说");

        List<Blog> blogList = mapper.queryBlogIf(hashMap);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }

        sqlSession.close();
    }

    @Test
    public void testqueryBlogChoose() {

        SqlSession sqlSession = MybatisUtil.getSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap hashMap = new HashMap();
        hashMap.put("title", "Java如此简单");
        hashMap.put("views", 9999);
        List<Blog> blogs = mapper.queryBlogChoose(hashMap);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
    }

    @Test
    public void testupdasteBlog() {

        SqlSession sqlSession = MybatisUtil.getSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap hashMap = new HashMap();
        hashMap.put("title", "Mybatis如此简单2");
        hashMap.put("author", "狂神说");
        hashMap.put("id","d7272ec317ae45d6a4df4f6a6bc8be56");
        mapper.updateBlog(hashMap);
        sqlSession.close();
    }

}
