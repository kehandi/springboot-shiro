package com.khd.springbootshiro.mapper;

import com.khd.springbootshiro.bean.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleMapper extends JpaRepository<Role, Integer> {
    Role findByName(String name);
}