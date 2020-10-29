package com.ljq.study.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author lijq
 * @date 2020/9/8 10:40
 * @desc .
 **/
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Autowired
    private TimeInterceptor interceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor);
    }
}
