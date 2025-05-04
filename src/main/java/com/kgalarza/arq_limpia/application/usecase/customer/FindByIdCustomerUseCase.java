package com.kgalarza.arq_limpia.application.usecase.customer;

import com.kgalarza.arq_limpia.application.exception.CustomerNotFoundException;
import com.kgalarza.arq_limpia.domain.gateway.ICustomerGateway;
import com.kgalarza.arq_limpia.domain.model.Customer;


public class FindByIdCustomerUseCase {

    private final ICustomerGateway customerGateway;

    public FindByIdCustomerUseCase(ICustomerGateway customerGateway) {
        this.customerGateway = customerGateway;
    }

    public Customer execute(Long id) {
        return customerGateway.getCustomerById(id)
                .orElseThrow(() -> new CustomerNotFoundException("Customer not found with id: " + id));
    }
}
