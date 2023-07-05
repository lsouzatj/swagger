package com.br.swagger.application.core.usecase;

import com.br.swagger.application.core.model.Customer;
import com.br.swagger.application.ports.in.InsertCustomerInputPort;
import com.br.swagger.application.ports.out.FindAddressByZipCodeOutput;
import com.br.swagger.application.ports.out.InsertCustomerOutputPort;

import java.util.Optional;

public class InsertCustomerUseCase implements InsertCustomerInputPort {
    private final InsertCustomerOutputPort insertCustomerOutputPort;
    private final FindAddressByZipCodeOutput findAddressByZipCodeOutput;

    public InsertCustomerUseCase(InsertCustomerOutputPort insertCustomerOutputPort, FindAddressByZipCodeOutput findAddressByZipCodeOutput) {
        this.insertCustomerOutputPort = insertCustomerOutputPort;
        this.findAddressByZipCodeOutput = findAddressByZipCodeOutput;
    }

    @Override
    public Customer save(Customer customer, String zipCode) {
        var addressResponse = findAddressByZipCodeOutput.findByZipCode(zipCode);
        if (Optional.ofNullable(addressResponse).isPresent()){
            customer.setAddress(addressResponse);
            customer.setCep(zipCode);
            var customerSaved = insertCustomerOutputPort.save(customer);
            return customerSaved;
        }
        return null;
    }
}
