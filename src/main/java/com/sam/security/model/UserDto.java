package com.sam.security.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

/**
 * @author Mr.xuewenming
 * @title: UserDto
 * @projectName _01_Securityspringmvc
 * @description: TODO
 * @date 2019/11/1215:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    public static final String SESSION_USER_KEY = "_user";
    //用户身份信息
    private String id;
    private String username;
    private String password;
    private String fullname;
    private String mobile;
    /**
     * 用户权限
     */
    private Set<String> authorities;
}
