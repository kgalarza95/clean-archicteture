package com.kgalarza.arq_limpia.domain.gateway;

import com.kgalarza.arq_limpia.domain.model.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerGateway {

    Optional<Customer> getCustomerById(Long id);

    List<Customer> getAllCustomers();

    Customer saveCustomer(Customer customer);

    Customer updateCustomer(Customer customer);

    void deleteCustomer(Long id);

}
