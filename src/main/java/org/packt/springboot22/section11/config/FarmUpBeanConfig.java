package org.packt.springboot22.section11.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class FarmUpBeanConfig {
    @Bean
    public String projectName() {
        return "FarmUp Harvestor";
    }

    @Bean
    @Lazy
    public String tabName() {
        return "FarmUp";
    }
}
