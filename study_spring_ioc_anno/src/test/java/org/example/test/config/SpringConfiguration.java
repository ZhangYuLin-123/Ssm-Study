package org.example.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// 标志该类是Spring核心配置类
@Configuration
// <context:component-scan base-package="org.example.test"/>
@ComponentScan("org.example.test")
// <import resource=""/>
@Import(DateSourceConfiguration.class)
public class SpringConfiguration {
}
