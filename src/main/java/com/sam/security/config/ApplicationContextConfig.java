package com.sam.security.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author Mr.xuewenming
 * @title: ApplicationContextConfig
 * @projectName _01_Securityspringmvc
 * @description: 相当于spring的applicationContext.xml
 * @date 2019/11/1214:41
 */
@Configuration
@ComponentScan(basePackages = "com.sam.security"
        ,excludeFilters={@ComponentScan.Filter(type = FilterType.ANNOTATION,value = Controller.class)})
public class ApplicationContextConfig {
}
