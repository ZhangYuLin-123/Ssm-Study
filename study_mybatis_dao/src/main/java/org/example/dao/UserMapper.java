package org.example.dao;

import org.example.domain.User;

import java.util.List;

public interface UserMapper {

    // 方法名和参数要和UserMapper.xml中对应
    List<User> findAll();

    User findByCondition(User user);

    List<User> findByIds(List<Integer> ids);

    void save(User user);
}
