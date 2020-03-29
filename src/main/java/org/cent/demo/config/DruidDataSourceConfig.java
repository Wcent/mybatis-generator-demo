//package org.cent.demo.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import com.alibaba.druid.support.http.StatViewServlet;
//import com.alibaba.druid.support.http.WebStatFilter;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//import java.util.*;
//
///**
// * @class: DruidDataSourceConfig
// * @description: 自定义数据源druid配置
// *               代码注册servlet及filter监控系统
// *               也可使用原生的servlet，filter方式，即通过应用启动类配置注解@ServletComponentScan启动扫描包的方式处理
// *               若使用Druid Spring Boot Starter可轻松集成Druid数据库连接池和监控，yml文件配置，无须java configuration
// * @author: cent
// * @create: 2020/3/28
// **/
//@Configuration
//@ConditionalOnClass(DruidDataSource.class)
//public class DruidDataSourceConfig {
//
//    /**
//     * 配置自定义druid数据源
//     * @return
//     */
//    @Bean(name = "druidDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSource druidDataSource() {
//        return new DruidDataSource();
//    }
//
//    /**
//     * 配置druid后台管理服务
//     * @return
//     */
//    @Bean
//    public ServletRegistrationBean druidStatViewServlet() {
//        ServletRegistrationBean servletBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
//        servletBean.addInitParameter("loginUsername", "admin");
//        servletBean.addInitParameter("loginPassword", "123456");
//        // 设置白名单，spring.datasource.druid.stat-view-servlet.allow=127.0.0.1
//        // 默认空允许所有访问
//        servletBean.addInitParameter("allow", "127.0.0.1");
//        // 设置黑名单，存在共同时，deny优先于allow
//        servletBean.addInitParameter("deny", "");
//        return servletBean;
//    }
//
//    /**
//     * 配置druid监控过滤器，WebStatFilter用于采集web-jdbc关联监控的数据
//     * @return
//     */
//    @Bean
//    public FilterRegistrationBean druidWebStatFilter() {
//        FilterRegistrationBean filterBean = new FilterRegistrationBean();
//        filterBean.setFilter(new WebStatFilter());
//        // 过滤规则
//        filterBean.setUrlPatterns(Collections.singletonList("/*"));
//        // 忽略格式
//        filterBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
//        return filterBean;
//    }
//}
