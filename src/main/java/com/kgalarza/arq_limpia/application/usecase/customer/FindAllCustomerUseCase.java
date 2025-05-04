package com.kgalarza.arq_limpia.application.usecase.customer;

import com.kgalarza.arq_limpia.domain.gateway.ICustomerGateway;
import com.kgalarza.arq_limpia.domain.model.Customer;

import java.util.List;

public class FindAllCustomerUseCase {

    private final ICustomerGateway customerGateway;

    public FindAllCustomerUseCase(ICustomerGateway customerGateway) {
        this.customerGateway = customerGateway;
    }

    public List<Customer> execute() {
        return customerGateway.getAllCustomers();
    }
}
