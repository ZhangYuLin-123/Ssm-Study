package org.example.service;

import org.example.domain.User;

import java.util.List;

public interface UserService {
    User login(String username, String password);

    List<User> list();

    void save(User user, Long[] roleIds);

    void del(Long userId);
}
