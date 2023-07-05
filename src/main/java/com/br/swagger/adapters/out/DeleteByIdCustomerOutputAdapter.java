package com.br.swagger.adapters.out;

import com.br.swagger.adapters.out.repository.CustomerRepository;
import com.br.swagger.adapters.out.repository.entity.CustomerEntity;
import com.br.swagger.application.core.model.Customer;
import com.br.swagger.application.ports.out.DeleteByIdCustomOutputPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Log4j2
@Component
@RequiredArgsConstructor
public class DeleteByIdCustomerOutputAdapter implements DeleteByIdCustomOutputPort {
    private final CustomerRepository customerRepository;
    @Override
    public void delete(Customer customer) {
        log.info("Deleting customer");
        CustomerEntity customerEntity = new CustomerEntity();
        BeanUtils.copyProperties(customer, customerEntity);
       customerRepository.delete(customerEntity);
       log.info("Customer deleted");
    }
}
