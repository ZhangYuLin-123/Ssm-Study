package org.example.factory;

import org.example.dao.UserDao;
import org.example.dao.impl.UserDaoImpl;

public class BeanFactory {

    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }

    public UserDao getUserDao2(){
        return new UserDaoImpl();
    }
}
