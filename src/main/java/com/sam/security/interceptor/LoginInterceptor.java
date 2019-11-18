package com.sam.security.interceptor;

import com.sam.security.model.UserDto;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

/**
 * @author Mr.xuewenming
 * @title: LongInterceptor
 * @projectName _01_Securityspringmvc
 * @description: TODO
 * @date 2019/11/1216:35
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Object attribute = session.getAttribute(UserDto.SESSION_USER_KEY);
        if (attribute == null) {
            writeContent(response,"请登录");
        }

        UserDto userDto = (UserDto) attribute;
        String requestURI = request.getRequestURI();
        Set<String> authorities = userDto.getAuthorities();
        if (authorities.contains("r1") && requestURI.contains("/r/r1")) {
            return true;
        }

        if (authorities.contains("r2") && requestURI.contains("r/r2")) {
            return true;
        }

        writeContent(response,"没有权限");

        return false;
    }

    private void writeContent(HttpServletResponse response,String msg) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter printWriter = response.getWriter();
        printWriter.print(msg);
        printWriter.close();
    }
}
