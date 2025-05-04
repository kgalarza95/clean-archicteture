package com.kgalarza.arq_limpia.infrastructure.entry.point.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.kgalarza.arq_limpia.application.usecase",
        includeFilters = {
                @ComponentScan.Filter(type = org.springframework.context.annotation.FilterType.REGEX, pattern = "^.+UseCase$")
        })
public class UseCaseConfiguration {
}
