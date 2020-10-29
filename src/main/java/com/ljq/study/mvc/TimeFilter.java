package com.ljq.study.mvc;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author lijq
 * @date 2020/9/8 10:21
 * @desc 过滤器
 **/
@Component
public class TimeFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("filter start");
        long start = System.currentTimeMillis();
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("filter 耗时: "+ (System.currentTimeMillis()-start));
        System.out.println("filter end");
    }
}
