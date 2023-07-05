package com.br.swagger.application.ports.in;

import com.br.swagger.application.core.model.Customer;

import java.util.Optional;

public interface FindByIdCustomerInputPort {
    Optional<Customer> findById(Long id0);
}
