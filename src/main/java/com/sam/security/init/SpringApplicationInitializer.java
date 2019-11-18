package com.sam.security.init;

import com.sam.security.config.ApplicationContextConfig;
import com.sam.security.config.SpringMvcConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author Mr.xuewenming
 * @title: SpringApplicationInitializer
 * @projectName _01_Securityspringmvc
 * @description: 相当于web.xml
 * @date 2019/11/1215:17
 */

public class SpringApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    // spring容器，相当于加载applicationContext.xml
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ApplicationContextConfig.class};
    }

    // servletContext,相当于加载springmvc.xml
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    // url-mapping
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
