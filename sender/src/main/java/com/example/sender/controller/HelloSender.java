package com.example.sender.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloSender {
    @Autowired
    private AmqpTemplate template;

    public void send(){

        int a=0;
        while (a<100){
            template.convertAndSend("queue","hello,yaoyang:"+a);
            a++;
        }
    }
}
