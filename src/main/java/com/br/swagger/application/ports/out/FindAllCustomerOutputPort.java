package com.br.swagger.application.ports.out;

import com.br.swagger.application.core.model.Customer;

import java.util.List;

public interface FindAllCustomerOutputPort {
    List<Customer> findAll();
}
