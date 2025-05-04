package com.kgalarza.arq_limpia.infrastructure.driven.adapter.mapper;

import com.kgalarza.arq_limpia.domain.model.Customer;
import com.kgalarza.arq_limpia.infrastructure.driven.adapter.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICustomerRepositoryMapper {

    Customer toDomain(CustomerEntity customerEntity);

    CustomerEntity toEntity(Customer customer);
}
