package com.codingshuttle.BeansDiIoc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeansDiIocApplication implements CommandLineRunner
{

    private final NotificationService notificationService;
    public BeansDiIocApplication(NotificationService notificationService)
    {
        this.notificationService = notificationService;
    }

    public static void main(String[] args) {
        SpringApplication.run(BeansDiIocApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {
        notificationService.notification("Hellooooooo.... ");
    }
}
