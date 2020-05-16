package com.study.dxbm.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author 古陵逝烟
 * @Date 2020/5/16 16:34
 * @Description
 * @Version V1.0
 **/
@WebServlet(urlPatterns = "/servlet/*")
@Slf4j
public class CustomServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("CustomServlet#doGet...");
    }
}
