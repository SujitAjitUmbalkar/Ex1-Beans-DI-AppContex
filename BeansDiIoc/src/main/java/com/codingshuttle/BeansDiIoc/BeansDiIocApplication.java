package com.codingshuttle.BeansDiIoc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeansDiIocApplication implements CommandLineRunner
{

    private final PaymentService paymentService;
    public BeansDiIocApplication(PaymentService paymentService)
    {
        this.paymentService = paymentService;
    }

    public static void main(String[] args) {
        SpringApplication.run(BeansDiIocApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {
        paymentService.pay();
    }
}
