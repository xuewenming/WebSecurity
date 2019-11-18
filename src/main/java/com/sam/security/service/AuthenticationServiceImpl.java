package com.sam.security.service;

import com.sam.security.model.AuthenticationRequest;
import com.sam.security.model.UserDto;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Mr.xuewenming
 * @title: AuthenticationService
 * @projectName _01_Securityspringmvc
 * @description: TODO
 * @date 2019/11/1215:47
 */
@Service
public class AuthenticationServiceImpl implements IAuthenticationService {
    @Override
    public UserDto getAuthenticationDetial(AuthenticationRequest request) {
        String username = request.getUsername();
        String password = request.getPassword();

        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            throw new RuntimeException("账号和密码为空");
        }

        /**
         * 操作数据库逻辑
         * 。。。
         */

        UserDto userDto = userMap.get(username);
        if (userDto == null) {
            throw new RuntimeException("用户为空");
        }

        String accessPassword = userDto.getPassword();
        if (password.equals(accessPassword)) {
            throw new RuntimeException("密码输入错误");
        }
        return userDto;
    }

    private Map<String, UserDto> userMap = new HashMap<>(2);{
        Set<String> aut1 = new HashSet<>(1);
        aut1.add("r1");
        Set<String> aut2 = new HashSet<>(1);
        aut2.add("r2");
        userMap.put("xiaohong",new UserDto("xiaohong","小红","1234",null,"1234567",aut1));
        userMap.put("xiaobai",new UserDto("xiaobai","小白","1234",null,"1234567",aut2));

    }


}
