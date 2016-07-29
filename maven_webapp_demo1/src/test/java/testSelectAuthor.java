import com.wanglei.model.Author;
import com.wanglei.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * Created by wanglei on 16/7/29.
 */
public class testSelectAuthor {
    public static  void main(String[] args) {
        //testSelectAuthor();
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlSessionFactory sqlSessionFactory = ctx.getBean("sqlSessionFactory",SqlSessionFactory.class);
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        List<Author> authors = sqlSession1.selectList("selectAuthorSub");
        for (Author author:authors) {
            System.out.println(author.getRealname()+"\n"+author.getUser().getNickname());
        }

    }
    public static void  testSelectAuthor(){
        String resource = "mybatis/config.xml";
        Reader reader = null;
        SqlSession sqlSession;
        try {
            reader = Resources.getResourceAsReader(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        //List<Author> authors = sqlSession1.selectList("selectAuthorJoin");
        //List<Author> authors = sqlSession1.selectList("selectAuthorCon");
        List<Author> authors = sqlSession1.selectList("selectAuthorSub");
        for (Author author:authors) {
            System.out.println(author.getRealname()+"\n"+author.getUser().getNickname());
        }
    }
}
