package com.br.swagger.application.ports.out;

import com.br.swagger.application.core.model.Customer;

public interface InsertCustomerOutputPort {
    Customer save(Customer customer);
}
