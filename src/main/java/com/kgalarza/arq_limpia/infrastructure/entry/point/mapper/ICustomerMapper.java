package com.kgalarza.arq_limpia.infrastructure.entry.point.mapper;

import com.kgalarza.arq_limpia.domain.model.Customer;
import com.kgalarza.arq_limpia.infrastructure.entry.point.dto.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICustomerMapper {

    CustomerDTO toDto(Customer customer);
    Customer toDomain(CustomerDTO customerDTO);

}
