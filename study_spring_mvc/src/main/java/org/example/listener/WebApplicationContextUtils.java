package org.example.listener;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

public class WebApplicationContextUtils {

    public static ApplicationContext getApplicationContext(ServletContext servletContext){
        ApplicationContext context = (ApplicationContext) servletContext.getAttribute("app");
        return context;
    }
}
