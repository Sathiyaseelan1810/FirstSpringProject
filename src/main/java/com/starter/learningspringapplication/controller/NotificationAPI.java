package com.starter.learningspringapplication.controller;

import com.starter.learningspringapplication.ImplementationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// @RestController = @Contoller + @ResponseBody
@RestController
@RequestMapping("/notificationsapi")

public class NotificationAPI {

    @Autowired
    //@Qualifier("email")
    private ImplementationService email;


    @GetMapping("/print")
    public String printMessage()
    {
        return this.email.returnMessage();
    }



}
