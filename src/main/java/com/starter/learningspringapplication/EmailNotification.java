package com.starter.learningspringapplication;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "email")
@Configuration
public class EmailNotification implements ImplementationService{


    @Override
    public String returnMessage() {
        return "Hello! This message printed in the Web Page sent from Email";
    }
}

