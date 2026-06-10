package com.codingshuttle.BeansDiIoc;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
//@Service
//@Controller
//@Repository
//@RestController
public class PaymentService
{
    public void  pay()
    {
        System.out.println("Paying... ");
    }

    @PostConstruct
    public void postConstruct()
    {
        System.out.println("After Bean creation");
    }

    @PreDestroy
    public void preDestroy()
    {
        System.out.println("Before Bean destroy");
    }
}
