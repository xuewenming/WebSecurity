package com.sam.security.service;

import com.sam.security.model.AuthenticationRequest;
import com.sam.security.model.UserDto;

/**
 * @author Mr.xuewenming
 * @title: IAuthenticationService
 * @projectName _01_Securityspringmvc
 * @description: TODO
 * @date 2019/11/1215:40
 */
public interface IAuthenticationService {

    UserDto getAuthenticationDetial(AuthenticationRequest request);

}
