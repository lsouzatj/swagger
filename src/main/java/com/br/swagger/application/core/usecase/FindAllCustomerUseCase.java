package com.br.swagger.application.core.usecase;

import com.br.swagger.application.core.model.Customer;
import com.br.swagger.application.ports.in.FindAllCustomerInputPort;
import com.br.swagger.application.ports.out.FindAddressByZipCodeOutput;
import com.br.swagger.application.ports.out.FindAllCustomerOutputPort;

import java.util.List;
import java.util.stream.Collectors;

public class FindAllCustomerUseCase implements FindAllCustomerInputPort {
    private final FindAllCustomerOutputPort findAllCustomerOutputPort;
    private final FindAddressByZipCodeOutput findAddressByZipCodeOutput;

    public FindAllCustomerUseCase(FindAllCustomerOutputPort findAllCustomerOutputPort, FindAddressByZipCodeOutput findAddressByZipCodeOutput) {
        this.findAllCustomerOutputPort = findAllCustomerOutputPort;
        this.findAddressByZipCodeOutput = findAddressByZipCodeOutput;
    }

    @Override
    public List<Customer> findAll() {
        var listCustomer = findAllCustomerOutputPort.findAll();
        listCustomer.stream()
                .map(customer -> {
                    var addressResponse =findAddressByZipCodeOutput.findByZipCode(customer.getCep());
                    customer.setAddress(addressResponse);
                    return customer;
                }).collect(Collectors.toList());
        return listCustomer;
    }
}
