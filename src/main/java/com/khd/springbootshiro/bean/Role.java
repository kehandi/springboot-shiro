package com.khd.springbootshiro.bean;

import lombok.Data;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "system_shiro_role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name; // 角色名 唯一

    private String description; // 描述信息

    @OneToMany(fetch = FetchType.EAGER)
    private List<Permission> permissions; // 一个用户角色对应多个权限


}