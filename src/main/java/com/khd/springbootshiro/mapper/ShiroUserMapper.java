package com.khd.springbootshiro.mapper;

import com.khd.springbootshiro.bean.ShiroUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShiroUserMapper extends JpaRepository<ShiroUser, Integer> {
    ShiroUser findByUsername(String username);

    ShiroUser findByUsernameAndPassword(String username, String password);
}