package com.br.swagger.application.ports.in;

import com.br.swagger.application.core.model.Customer;

import java.util.List;

public interface FindAllCustomerInputPort {
    List<Customer> findAll();
}
