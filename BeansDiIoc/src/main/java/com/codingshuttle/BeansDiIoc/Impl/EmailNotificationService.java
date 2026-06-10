package com.codingshuttle.BeansDiIoc.Impl;

import com.codingshuttle.BeansDiIoc.NotificationService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class EmailNotificationService implements NotificationService
{
    @Override
    public void notification(String message) {
        System.out.println("Email sending "+message);
    }
}
