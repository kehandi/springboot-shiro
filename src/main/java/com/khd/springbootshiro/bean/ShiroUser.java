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
@Table(name = "system_shiro_user")
public class ShiroUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String username;// 用户名 唯一
    private String password;// 用户密码

    @OneToMany(fetch = FetchType.EAGER)
    private List<Role> roles;// 用户角色 一个用户可能有一个角色，也可能有 多个角色

}