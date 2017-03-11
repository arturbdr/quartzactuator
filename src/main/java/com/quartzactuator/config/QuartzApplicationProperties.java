package com.quartzactuator.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "quartz.config")
public class QuartzApplicationProperties {

    private String dataSourceUrl;

    private String dataSourceUsername;

    private String dataSourcePassword;

    private String dataSourceDriverClassName;

}