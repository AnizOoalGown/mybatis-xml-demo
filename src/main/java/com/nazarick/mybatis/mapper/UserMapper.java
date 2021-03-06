package com.nazarick.mybatis.mapper;

import com.nazarick.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAll();
    User findById(Long id);
    int insert(User user);
    int update(User user);
    int deleteById(Long id);
}
