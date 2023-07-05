package com.br.swagger.configs;

import com.br.swagger.adapters.out.FindAddressByZipCodeOutputAdapter;
import com.br.swagger.adapters.out.FindByIdCustomerOutputAdapater;
import com.br.swagger.application.core.usecase.FindByIdCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindByIdCustomerConfig {
    @Bean
    public FindByIdCustomerUseCase findByIdCustomerUseCase(FindByIdCustomerOutputAdapater findByIdCustomerOutputAdapater,
                                                           FindAddressByZipCodeOutputAdapter findAddressByZipCodeOutputAdapter){
        return new FindByIdCustomerUseCase(findByIdCustomerOutputAdapater, findAddressByZipCodeOutputAdapter);
    }
}
