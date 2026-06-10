package com.codingshuttle.BeansDiIoc;

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
}
