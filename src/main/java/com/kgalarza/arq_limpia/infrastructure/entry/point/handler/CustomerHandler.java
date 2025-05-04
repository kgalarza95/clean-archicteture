package com.kgalarza.arq_limpia.infrastructure.entry.point.handler;


import com.kgalarza.arq_limpia.application.usecase.customer.*;
import com.kgalarza.arq_limpia.infrastructure.entry.point.dto.CustomerDTO;
import com.kgalarza.arq_limpia.infrastructure.entry.point.mapper.ICustomerMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerHandler {

    private final FindAllCustomerUseCase findAllCustomerUseCase;
    private final FindByIdCustomerUseCase findByIdCustomerUseCase;
    private final SaveCustomerUseCase saveCustomerUseCase;
    private final UpdateCustomerUseCase updateCustomerUseCase;
    private final DeleteCustomerUseCase deleteCustomerUseCase;
    private final ICustomerMapper customerMapper;

    public CustomerHandler(FindAllCustomerUseCase findAllCustomerUseCase, FindByIdCustomerUseCase findByIdCustomerUseCase, SaveCustomerUseCase saveCustomerUseCase, UpdateCustomerUseCase updateCustomerUseCase, DeleteCustomerUseCase deleteCustomerUseCase, ICustomerMapper customerMapper) {
        this.findAllCustomerUseCase = findAllCustomerUseCase;
        this.findByIdCustomerUseCase = findByIdCustomerUseCase;
        this.saveCustomerUseCase = saveCustomerUseCase;
        this.updateCustomerUseCase = updateCustomerUseCase;
        this.deleteCustomerUseCase = deleteCustomerUseCase;
        this.customerMapper = customerMapper;
    }

    public CustomerDTO findCustomerById(Long id) {
        return customerMapper.toDto(findByIdCustomerUseCase.execute(id));
    }

    public List<CustomerDTO> getAllCustomers() {
        return findAllCustomerUseCase.execute()
                .stream()
                .map(customerMapper::toDto)
                .toList();
    }

    public CustomerDTO saveCustomer(CustomerDTO customerDTO) {
        return customerMapper.toDto(saveCustomerUseCase.execute(customerMapper.toDomain(customerDTO)));
    }

    public CustomerDTO updateCustomer(CustomerDTO customerDTO) {
        return customerMapper.toDto(updateCustomerUseCase.execute(customerMapper.toDomain(customerDTO)));
    }

    public void deleteCustomerById(Long id) {
        deleteCustomerUseCase.execute(id);
    }

}
