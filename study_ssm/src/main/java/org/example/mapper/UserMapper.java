package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.domain.User;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

public interface UserMapper {
    // 方法名和参数要和UserMapper.xml中对应
    List<User> findAll();
}
