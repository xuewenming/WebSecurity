package com.sam.security.controller;

import com.sam.security.model.AuthenticationRequest;
import com.sam.security.model.UserDto;
import com.sam.security.service.IAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author Mr.xuewenming
 * @title: LoginController
 * @projectName _01_Securityspringmvc
 * @description: TODO
 * @date 2019/11/1215:41
 */
@RestController
public class LoginController {

    @Autowired
    private IAuthenticationService iAuthenticationService;

    @GetMapping(value = "/login",produces = "text/plain;charset=utf-8")
    public UserDto login(AuthenticationRequest request, HttpSession session) {
        UserDto user = iAuthenticationService.getAuthenticationDetial(request);
        session.setAttribute(UserDto.SESSION_USER_KEY,user);
        return user;
    }

    @GetMapping("/logout")
    public void logout(HttpSession session) {
        session.invalidate();
    }



}
