package org.example.test;

import org.example.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao dao = (UserDao) context.getBean("userDao");
        System.out.println(dao);
        /*UserDao dao1 = (UserDao) context.getBean("userDao");
        System.out.println(dao1);

        ((ClassPathXmlApplicationContext)context).close();*/
    }
}
