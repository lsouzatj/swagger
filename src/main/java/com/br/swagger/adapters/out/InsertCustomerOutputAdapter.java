package com.br.swagger.adapters.out;

import com.br.swagger.application.core.model.Customer;
import com.br.swagger.application.ports.out.InsertCustomerOutputPort;
import com.br.swagger.adapters.out.repository.CustomerRepository;
import com.br.swagger.adapters.out.repository.entity.CustomerEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Log4j2
@Component
@RequiredArgsConstructor
public class InsertCustomerOutputAdapter implements InsertCustomerOutputPort {

    private final CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
        log.info("Saving customer");
        CustomerEntity customerEntity = new CustomerEntity();
        BeanUtils.copyProperties(customer, customerEntity);
        var customerSaved = customerRepository.save(customerEntity);
        BeanUtils.copyProperties(customerSaved, customer);
        log.info("Customer saved");
        return customer;
    }
}
