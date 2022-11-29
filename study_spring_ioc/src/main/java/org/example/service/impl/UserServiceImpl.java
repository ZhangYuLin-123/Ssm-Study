package org.example.service.impl;

import org.example.dao.UserDao;
import org.example.dao.impl.UserDaoImpl;
import org.example.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;


    public void save(){
        this.userDao.save();
        System.out.println(this.userDao.toString());
    }

    // set方法注入
    /*public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    public UserServiceImpl(){

    }
    public UserServiceImpl(UserDao userDao){
        this.userDao = userDao;
    }
}
