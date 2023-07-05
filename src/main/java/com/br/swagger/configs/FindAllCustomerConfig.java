package com.br.swagger.configs;

import com.br.swagger.adapters.out.FindAddressByZipCodeOutputAdapter;
import com.br.swagger.adapters.out.FindAllCustomerOutputAdapter;
import com.br.swagger.application.core.usecase.FindAllCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindAllCustomerConfig {
    @Bean
    public FindAllCustomerUseCase findAllCustomerUseCase(FindAllCustomerOutputAdapter findAllCustomerOutputAdapter,
                                                         FindAddressByZipCodeOutputAdapter findAddressByZipCodeOutputAdapter){
        return new FindAllCustomerUseCase(findAllCustomerOutputAdapter, findAddressByZipCodeOutputAdapter);
    }
}
