package com.codingshuttle.BeansDiIoc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean           // preference given to this
    public PaymentService paymentService()
    {
        System.out.println("paymentService preference given to @Bean");
        // you can add more logic here
        return new PaymentService();
    }
}
