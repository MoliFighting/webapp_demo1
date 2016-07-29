import com.wanglei.dao.IUserDao;
import com.wanglei.model.Author;
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
public class testUpdateAuthor {
    public static  void main(String[] args){
        testInsert();
        //testUpdate();
        //testDelete();
    }


    public static  void testInsert(){
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
        try {
            User user = new User();
            user.setNickname("dddd");
            user.setPassword("ffffff");
            sqlSession1.insert("insertUser",user);
            //这是mybatis的特性之一 可以自动为传过来的对象附加ID值
            //数据库中设计ID自增 所以穿过去的对象是没有ID属性的 但是添加到数据库之后会有ID属性
            //mybatis会把这个数据库确定的ID值 回传给对象
            System.out.print(user.getId());

            Author author = new Author();
            author.setRealname("daniu");
            author.setUser(user);
            //插入新用户
            sqlSession1.insert("insertAuthor",author);
            sqlSession1.commit();
        }
        catch (Exception e){
            e.printStackTrace();
            sqlSession1.rollback();
        }
        finally {
            sqlSession1.close();
        }
    }


    public static  void testUpdate(){
        String resource = "mybatis/config.xml";
        Reader reader = null;
        SqlSession sqlSession;
        try {
            reader = Resources.getResourceAsReader(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession1  = sqlSessionFactory.openSession();
        try {
            User user = new User();
            user.setId(8);
            user.setNickname("uuuu");
            user.setPassword("iiiii");
            //更新用户
            sqlSession1.update("updateUser",user);
            sqlSession1.commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            sqlSession1.close();
        }
    }

    public static  void testDelete(){
        String resource = "mybatis/config.xml";
        Reader reader = null;
        SqlSession sqlSession;
        try {
            reader = Resources.getResourceAsReader(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //sqlSessionFactory.getConfiguration().addMapper(IUserDao.class);
        SqlSession sqlSession1  = sqlSessionFactory.openSession();
        try {
            //删除用户
            IUserDao iUserDao = sqlSession1.getMapper(IUserDao.class);
            iUserDao.deleteUser(8);
            sqlSession1.commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            sqlSession1.close();
        }
    }
}
