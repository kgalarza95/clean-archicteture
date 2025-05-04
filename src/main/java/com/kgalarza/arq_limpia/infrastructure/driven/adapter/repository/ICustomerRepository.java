package com.kgalarza.arq_limpia.infrastructure.driven.adapter.repository;

import com.kgalarza.arq_limpia.infrastructure.driven.adapter.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<CustomerEntity, Long> {
}
