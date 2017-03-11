package com.quartzactuator.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@RequiredArgsConstructor
public class QuartzDataSource {

    private final QuartzApplicationProperties quartzApplicationProperties;

    @Bean("dataSourceBean")
    public DataSource dataSourceBean() {
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(quartzApplicationProperties.getDataSourceDriverClassName());
        dataSource.setUrl(quartzApplicationProperties.getDataSourceUrl() + "?useSSL=false");
        dataSource.setUsername(quartzApplicationProperties.getDataSourceUsername());
        dataSource.setPassword(quartzApplicationProperties.getDataSourcePassword());
        return dataSource;
    }
}
