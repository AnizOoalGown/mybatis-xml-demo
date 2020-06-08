package com.nazarick.mybatis;

import com.nazarick.mybatis.entity.User;
import com.nazarick.mybatis.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisXmlApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void testFindAllUser() {
        System.out.println(userMapper.findAll());
    }

    @Test
    void testFindUserById() {
        System.out.println(userMapper.findById(1L));
    }

    @Test
    void testUpdateUser() {
        User user = new User();
        user.setId(1L);
        user.setUsername("Aniz");
        System.out.println(userMapper.update(user));
    }

    @Test
    void testAddUser() {
        User user = new User();
        user.setUsername("Foo");
        user.setGender("unknown");
        System.out.println(userMapper.insert(user));
    }

    @Test
    void testDeleteUser() {
        System.out.println(userMapper.deleteById(1L));
    }

}
