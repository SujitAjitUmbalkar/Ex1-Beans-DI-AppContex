package com.codingshuttle.BeansDiIoc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeansDiIocApplication implements CommandLineRunner
{

    private final NotificationService notificationService;
    public BeansDiIocApplication(@Qualifier("emailNotif") NotificationService notificationService)
    {
        this.notificationService = notificationService;
    }

    // if @RequiredArgsConstructor is used , then use @Qualifier on variable
//    @Qualifier("smsNotif)
//    private final NotificationService notificationService2;

    public static void main(String[] args) {
        SpringApplication.run(BeansDiIocApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {
        notificationService.notification("Hellooooooo.... ");
    }
}
