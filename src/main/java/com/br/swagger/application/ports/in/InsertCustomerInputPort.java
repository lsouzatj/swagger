package com.br.swagger.application.ports.in;

import com.br.swagger.application.core.model.Customer;

public interface InsertCustomerInputPort {
    Customer save(Customer customer, String zipCode);
}
