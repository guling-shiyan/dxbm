package com.study.dxbm.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Author 古陵逝烟
 * @Date 2020/5/16 15:56
 * @Description
 * @Version V1.0
 **/

@WebFilter("/filter/*")
@Slf4j
public class CustomFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        log.info("CustomFilter#doFilter...");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
