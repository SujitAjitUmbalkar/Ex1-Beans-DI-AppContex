package com.codingshuttle.BeansDiIoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class BeansDiIocApplication implements CommandLineRunner
{
    @Autowired(required = false)            // null if not present
    Map<String , NotificationService> notificationServices = new HashMap<>();

    public static void main(String[] args) {
        SpringApplication.run(BeansDiIocApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {
        for(var notificationService : notificationServices.entrySet())
        {
            System.out.println(notificationService.getKey());
            notificationService.getValue().notification("Hellooooooo");
        }
    }
}
