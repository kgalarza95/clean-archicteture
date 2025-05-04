package com.kgalarza.arq_limpia.infrastructure.entry.point.config;

import com.kgalarza.arq_limpia.application.usecase.customer.FindAllCustomerUseCase;
import com.kgalarza.arq_limpia.domain.gateway.ICustomerGateway;
import org.springframework.context.annotation.Bean;

//@Configuration
public class UseCaseBeanConfig {

    @Bean
    public FindAllCustomerUseCase findAllCustomerUseCase(ICustomerGateway customerGateway) {
        return new FindAllCustomerUseCase(customerGateway);
    }
}
