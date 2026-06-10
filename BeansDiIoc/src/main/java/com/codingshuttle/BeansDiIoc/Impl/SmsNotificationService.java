package com.codingshuttle.BeansDiIoc.Impl;

import com.codingshuttle.BeansDiIoc.NotificationService;
import org.springframework.stereotype.Service;

@Service
public class SmsNotificationService implements NotificationService
{
    @Override
    public void notification(String message)
    {
        System.out.println("SMS sending "+message);
    }
}
