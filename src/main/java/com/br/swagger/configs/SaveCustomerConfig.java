package com.br.swagger.configs;

import com.br.swagger.adapters.out.FindAddressByZipCodeOutputAdapter;
import com.br.swagger.adapters.out.InsertCustomerOutputAdapter;
import com.br.swagger.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SaveCustomerConfig {
    @Bean
    InsertCustomerUseCase saveCustomerUseCase(InsertCustomerOutputAdapter saveCustomerOutputAdapter,
                                              FindAddressByZipCodeOutputAdapter FindAddressByZipCodeOutputAdapter){
        return new InsertCustomerUseCase(saveCustomerOutputAdapter, FindAddressByZipCodeOutputAdapter);
    }
}
