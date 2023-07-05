package com.br.swagger.configs;

import com.br.swagger.adapters.out.DeleteByIdCustomerOutputAdapter;
import com.br.swagger.application.core.usecase.DeleteByIdCustomerUserCase;
import com.br.swagger.application.core.usecase.FindByIdCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteByIdCustomerConfig {
    @Bean
    public DeleteByIdCustomerUserCase deleteByIdCustomerUserCase(DeleteByIdCustomerOutputAdapter deleteByIdCustomerOutputAdapter,
                                                                 FindByIdCustomerUseCase findByIdCustomerUseCase){
        return new DeleteByIdCustomerUserCase(deleteByIdCustomerOutputAdapter, findByIdCustomerUseCase);
    }
}
