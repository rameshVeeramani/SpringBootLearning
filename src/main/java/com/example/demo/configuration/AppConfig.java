package com.example.demo.configuration;

import org.springframework.boot.context.properties.ConfigurationBeanFactoryMetadata;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


import java.text.NumberFormat;
import java.util.Locale;

@Configuration
public class AppConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public NumberFormat getCurrency() {
        return NumberFormat.getCurrencyInstance();
    }

    @Bean
    public NumberFormat getKoreaCurrency() {
        return NumberFormat.getCurrencyInstance(Locale.KOREA);
    }
}
