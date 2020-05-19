package com.khd.springbootshiro.mapper;

import com.khd.springbootshiro.bean.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionMapper extends JpaRepository<Permission, Integer> {
    Permission findByName(String name);
}