package com.khd.springbootshiro;

import com.khd.springbootshiro.bean.ShiroUser;
import com.khd.springbootshiro.mapper.ShiroUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootShiroApplicationTests {

    @Autowired
    private ShiroUserMapper shiroUserMapper;


    @Test
    void contextLoads() {
    }

    @Test
    void getUser() {
        ShiroUser user = shiroUserMapper.findByUsername("admin");
        System.out.println(user);
    }

}
