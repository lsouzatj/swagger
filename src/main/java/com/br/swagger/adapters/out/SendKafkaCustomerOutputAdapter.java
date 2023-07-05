package com.br.swagger.adapters.out;

import com.br.swagger.adapters.out.producer.SendKafkaCustomer;
import com.br.swagger.application.core.model.Customer;
import com.br.swagger.application.ports.out.SendKafkaCustomerOuputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SendKafkaCustomerOutputAdapter implements SendKafkaCustomerOuputPort {

    private final SendKafkaCustomer sendKafkaCustomer;

    @Override
    public void send(Customer customer) {
        sendKafkaCustomer.send(customer);
    }
}
