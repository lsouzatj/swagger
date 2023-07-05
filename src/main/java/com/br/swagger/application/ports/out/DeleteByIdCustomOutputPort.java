package com.br.swagger.application.ports.out;

import com.br.swagger.application.core.model.Customer;

public interface DeleteByIdCustomOutputPort {
    void delete(Customer customer);
}
