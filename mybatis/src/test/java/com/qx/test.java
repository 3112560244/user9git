package com.qx;

import com.qx.dao.UserDao;
import com.qx.domain.User;
import lombok.extern.log4j.Log4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class test {
    @Test
    public static void main(String[] args) {
        String resource = "mybatis-config.xml";

        SqlSession sqlSession = null;
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            sqlSession = sqlSessionFactory.openSession();
//            User user = new User("q",true,new Date(),"1231231123");
            User user= new User();
            user.setBirthday(new Date());
            user.setGender(true);
            user.setMobile("111111");
            user.setName("22222222");
            UserDao userDao = sqlSession.getMapper(UserDao.class);

            userDao.save(user);
            System.out.println("----------------------");
            List<User> users = userDao.findAll();
            System.out.println(users);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("打开数据库失败");
        }
        sqlSession.commit();
        sqlSession.close();

    }
}
