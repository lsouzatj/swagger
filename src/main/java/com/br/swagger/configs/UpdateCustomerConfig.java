package com.br.swagger.configs;

import com.br.swagger.adapters.out.SendKafkaCustomerOutputAdapter;
import com.br.swagger.adapters.out.UpdateCustomerOutputAdapter;
import com.br.swagger.application.core.usecase.FindByIdCustomerUseCase;
import com.br.swagger.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {
    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(UpdateCustomerOutputAdapter updateCustomerOutputAdapter,
                                                       FindByIdCustomerUseCase findByIdCustomerUseCase,
                                                       SendKafkaCustomerOutputAdapter sendKafkaCustomerOutputAdapter) {
        return new UpdateCustomerUseCase(updateCustomerOutputAdapter, findByIdCustomerUseCase, sendKafkaCustomerOutputAdapter);
    }
}
