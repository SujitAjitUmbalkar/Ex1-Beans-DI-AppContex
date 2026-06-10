package com.codingshuttle.BeansDiIoc.Impl;

import com.codingshuttle.BeansDiIoc.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@Qualifier("smsNotif")
//@ConditionalOnProperty(name = "notification.type", havingValue = "sms")
public class SmsNotificationService implements NotificationService
{
    @Override
    public void notification(String message)
    {
        System.out.println("SMS sending "+message);
    }
}
