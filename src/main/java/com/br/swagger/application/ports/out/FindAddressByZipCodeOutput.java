package com.br.swagger.application.ports.out;

import com.br.swagger.application.core.model.Address;

public interface FindAddressByZipCodeOutput {
    Address findByZipCode(String zipCode);
}
