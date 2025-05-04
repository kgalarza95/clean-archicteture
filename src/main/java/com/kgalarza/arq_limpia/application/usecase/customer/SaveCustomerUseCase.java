package com.kgalarza.arq_limpia.application.usecase.customer;

import com.kgalarza.arq_limpia.domain.gateway.ICustomerGateway;
import com.kgalarza.arq_limpia.domain.model.Customer;

public class SaveCustomerUseCase {

    private final ICustomerGateway customerGateway;

    public SaveCustomerUseCase(ICustomerGateway customerGateway) {
        this.customerGateway = customerGateway;
    }

    public Customer execute(Customer customer) {
        return customerGateway.saveCustomer(customer);
    }
}
