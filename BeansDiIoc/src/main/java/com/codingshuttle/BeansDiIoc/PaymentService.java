package com.codingshuttle.BeansDiIoc;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
//@Service
//@Controller
//@Repository
//@RestController

//@Scope("singleton")
//@Scope("request")
//@Scope("application")
//@Scope("session")
@Scope("prototype")
public class PaymentService
{
    public void  pay()
    {
        System.out.println("Paying... ");
    }

//    @PostConstruct
//    public void postConstruct()
//    {
//        System.out.println("After Bean creation");
//    }
//
//    @PreDestroy
//    public void preDestroy()
//    {
//        System.out.println("Before Bean destroy");
//    }
}
