import com.wanglei.model.Author;
import com.wanglei.model.User;
import com.wanglei.model.Visit;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * Created by wanglei on 16/7/29.
 */
public class testCollection {
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
        List<User> users = sqlSession1.selectList("selectVisit");
        for (User user:users) {
            System.out.println(user.getVisitList().size());
            for (Visit visit:user.getVisitList()) {
                System.out.println(visit.getVisitID());
            }
        }
    }
}
