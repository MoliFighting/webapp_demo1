import com.wanglei.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by wanglei on 16/7/29.
 */
public class testSelectUserByID {
    public static  void main(String[] args){
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
        User user = sqlSession1.selectOne("getUserByID",7);
        System.out.print(user.getNickname());
    }
}
