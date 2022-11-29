package org.example.dao;

import org.example.domain.User;

import java.util.List;

public interface UserDao {
    User login(String username, String password);

    List<User> findAll();

    Long save(User user);

    void saveUserRoleRel(Long id, Long[] roleIds);

    void delUserRoleRel(Long userId);

    void del(Long userId);
}
