package org.example.test.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

// <context:property-placeholder location="classpath:jdbc.properties"/>
@PropertySource("classpath:jdbc.properties")
public class DateSourceConfiguration {

    @Value("${jdbc.driver}")
    private String driver;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Bean(name = "dataSource")
    public DataSource getDataSource() throws PropertyVetoException {
        /**
         * <bean id="dataSource" class="com.mchange.v2.c3p0.ComboPooledDataSource">
         *     <property name="driverClass" value="${jdbc.driver}"></property>
         *     <property name="jdbcUrl" value="${jdbc.url}"></property>
         *     <property name="user" value="${jdbc.username}"></property>
         *     <property name="password" value="${jdbc.password}"></property>
         * </bean>
         */

        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(driver);
        dataSource.setJdbcUrl(url);
        dataSource.setUser(username);
        dataSource.setPassword(password);

        return dataSource;
    }

}
