package com.br.swagger.application.ports.out;

import com.br.swagger.application.core.model.Customer;

import java.util.Optional;

public interface UpdateCustomerOutputPort {
    Optional<Customer> update(Customer customer);
}
