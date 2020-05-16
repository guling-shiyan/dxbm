package com.study.dxbm.listener;

import ch.qos.logback.core.net.server.ServerListener;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @Author 古陵逝烟
 * @Date 2020/5/16 15:59
 * @Description
 * @Version V1.0
 **/
@WebListener
@Slf4j
public class CustomListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("CustomListener#contextInitialized...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
