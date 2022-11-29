package org.example.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        // 读取Web.xml中的全局参数
        String location = servletContext.getInitParameter("contextConfigLocation");
        //ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext(location);

        // 将Spring的应用上下文对象存储到ServletContext域中
        servletContext.setAttribute("app", context);
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
