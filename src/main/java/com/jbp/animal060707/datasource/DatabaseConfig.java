package com.jbp.animal060707.datasource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
//dataSource 를 만들어놓으면 커넥션을 맺고 끊는 과정이 줄어들기 때문에 속도와 성능이 향상된다.
@Configuration
public class DatabaseConfig {
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mariadb://localhost:33061/animal_api");
        dataSource.setUsername("study");
        dataSource.setPassword("test1234");
        dataSource.setDriverClassName("org.mariadb.jdbc.Driver");
        return dataSource;
    }
}