package org.example.dao.impl;

import org.example.dao.UserDao;
import org.example.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoImpl implements UserDao {
    private String name;
    private List<String> stringList;
    private Map<String, User> userMap;
    private Properties properties;

    public void setName(String name) {
        this.name = name;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public UserDaoImpl(){
        System.out.println("userDaoImpl create...");
    }

    public void save() {
        System.out.println("save...");
    }

    public void init(){
        System.out.println("初始化方法...");
    }

    public void destroy(){
        System.out.println("销毁方法...");

    }

    @Override
    public String toString() {
        return "UserDaoImpl{" +
                "name='" + name + '\'' +
                ", stringList=" + stringList +
                ", userMap=" + userMap +
                ", properties=" + properties +
                '}';
    }
}
