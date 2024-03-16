package com.starter.learningspringapplication.service;

import com.starter.learningspringapplication.ImplementationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service(value = "sms")


public class SMSNotification implements ImplementationService {


    @Override
    public String returnMessage() {
        return "Hello! This message printed in the Web Page sent from SMS";
    }
}
