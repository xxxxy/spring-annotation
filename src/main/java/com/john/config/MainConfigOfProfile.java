package com.john.config;

import com.john.beans.Older;
import com.john.beans.Sugar;
import com.john.dao.UserDao;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.*;
import org.springframework.util.StringValueResolver;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Profile("sit")
@Configuration
@PropertySource("classpath:db.properties")
public class MainConfigOfProfile implements EmbeddedValueResolverAware {

    @Value("${db.user}")
    private String user;
    private String driverClass;

    @Profile("sit")
    @Bean("sit")
    public DataSource dataSourceSit(@Value("${db.sit.pwd}") String pwd) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(pwd);
        dataSource.setJdbcUrl("jdbc:mysql://3306-W-T-LC-SIT-01-MYC1.service.dc_sd.consul:3306/test");
        dataSource.setDriverClass(driverClass);
        return dataSource;
    }

    @Profile("default")
    @Bean("uat")
    public DataSource dataSourceUat(@Value("${db.uat.pwd}") String pwd) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(pwd);
        dataSource.setJdbcUrl("jdbc:mysql://3306-W-LMS-UAT-LC01-MYC3.service.dc_sd.consul:3306/test");
        dataSource.setDriverClass(driverClass);
        return dataSource;
    }

    @Profile("ver")
    @Bean("ver")
    public DataSource dataSourceVer(@Value("${db.ver.pwd}") String pwd) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(pwd);
        dataSource.setJdbcUrl("jdbc:mysql://3306-W-LMS-VER-HLS01-MYC1.service.dc_sd.consul:3306/test");
        dataSource.setDriverClass(driverClass);
        return dataSource;
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        driverClass = resolver.resolveStringValue("${db.driverClass}");
    }
}
