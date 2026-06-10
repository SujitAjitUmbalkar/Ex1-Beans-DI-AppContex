package com.codingshuttle.BeansDiIoc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean           // preference given to this
    public PaymentService paymentService()
    {
        return new PaymentService();
    }
}
