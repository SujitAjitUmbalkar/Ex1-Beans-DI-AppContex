package com.codingshuttle.BeansDiIoc.Impl;

import com.codingshuttle.BeansDiIoc.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary
//@Service
@Qualifier("emailNotif")
//@ConditionalOnProperty(name = "notification.type", havingValue = "email")
public class EmailNotificationService implements NotificationService
{
    @Override
    public void notification(String message) {
        System.out.println("Email sending "+message);
    }
}
