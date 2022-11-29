package org.example.web;

import org.example.listener.WebApplicationContextUtils;
import org.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContext servletContext = this.getServletContext();
        // ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // ApplicationContext context = (ApplicationContext) servletContext.getAttribute("app");
        ApplicationContext context = WebApplicationContextUtils.getApplicationContext(servletContext);
        UserService userService = (UserService) context.getBean("userService");
        userService.save();
    }
}
