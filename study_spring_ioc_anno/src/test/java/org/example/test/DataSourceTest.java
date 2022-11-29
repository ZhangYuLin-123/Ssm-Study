package org.example.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.example.test.config.SpringConfiguration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.ResourceBundle;

public class DataSourceTest {
    /**
     * 加载核心配置类创建Spring容器并从容器中获取数据源
     * @throws Exception
     */
    @Test
    public void AnnoConfigrationTest() throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        DataSource dataSource = (DataSource) context.getBean("dataSource");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }


    /**
     * 从容器中获取数据源
     * @throws Exception
     */
    @Test
    public void test() throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = context.getBean(DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    /**
     * 读取配置文件jdbc.properties来创建c3p0数据源
     * @throws Exception
     */
    @Test
    public void c3p0PropertiesTest() throws Exception{
        // 加载类路径下的jdbc.properties
        ResourceBundle rb = ResourceBundle.getBundle("jdbc");
        ComboPooledDataSource dataSource = new ComboPooledDataSource();

        dataSource.setDriverClass(rb.getString("jdbc.driver"));
        dataSource.setJdbcUrl(rb.getString("jdbc.url"));
        dataSource.setUser(rb.getString("jdbc.username"));
        dataSource.setPassword(rb.getString("jdbc.password"));

        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    /**
     * 手动创建c3p0连接池
     * @throws Exception
     */
    @Test
    public void c3p0Test() throws Exception{
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUser("root");
        dataSource.setPassword("123456");

        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    /**
     * 手动创建druid连接池
     * @throws Exception
     */
    @Test
    public void druidTest() throws Exception{
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");

        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();

    }
}
