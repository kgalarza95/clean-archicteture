package com.kgalarza.arq_limpia.infrastructure.driven.adapter.adapter;

import com.kgalarza.arq_limpia.domain.gateway.ICustomerGateway;
import com.kgalarza.arq_limpia.domain.model.Customer;
import com.kgalarza.arq_limpia.infrastructure.driven.adapter.entity.CustomerEntity;
import com.kgalarza.arq_limpia.infrastructure.driven.adapter.mapper.ICustomerRepositoryMapper;
import com.kgalarza.arq_limpia.infrastructure.driven.adapter.repository.ICustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CustomerRepositoryAdapter implements ICustomerGateway {

    private final ICustomerRepository customerRepository;
    private final ICustomerRepositoryMapper customerRepositoryMapper;

    public CustomerRepositoryAdapter(ICustomerRepository customerRepository, ICustomerRepositoryMapper customerRepositoryMapper) {
        this.customerRepository = customerRepository;
        this.customerRepositoryMapper = customerRepositoryMapper;
    }

    @Override
    public Optional<Customer> getCustomerById(Long id) {
//        Optional<CustomerEntity> customerEntity = customerRepository.findById(id);
//        return customerEntity
//                .map(customerRepositoryMapper::toDomain);

        return customerRepository.findById(id)
                .map(customerRepositoryMapper::toDomain);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll()
                .stream()
                .map(customerRepositoryMapper::toDomain)
                .toList();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        CustomerEntity customerEntity = customerRepository.save(customerRepositoryMapper.toEntity(customer));
        return customerRepositoryMapper.toDomain(customerEntity);
        //return customerRepositoryMapper.toDomain(customerRepository.save(customerRepositoryMapper.toEntity(customer)));
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerRepositoryMapper.toDomain(customerRepository.save(customerRepositoryMapper.toEntity(customer)));
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
