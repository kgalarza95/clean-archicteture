package com.kgalarza.arq_limpia.application.usecase.customer;

import com.kgalarza.arq_limpia.domain.gateway.ICustomerGateway;

public class DeleteCustomerUseCase {

    private final ICustomerGateway customerGateway;

    public DeleteCustomerUseCase(ICustomerGateway customerGateway) {
        this.customerGateway = customerGateway;
    }

    public void execute(Long id) {
        customerGateway.deleteCustomer(id);
    }
}
