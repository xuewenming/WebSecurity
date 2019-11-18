package com.sam.security.model;

import lombok.Data;

/**
 * @author Mr.xuewenming
 * @title: AuthenticationRequest
 * @projectName _01_Securityspringmvc
 * @description: TODO
 * @date 2019/11/1215:42
 */
@Data
public class AuthenticationRequest {

    private String username;
    private String password;

}
