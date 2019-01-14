package com.example.sender.controller;

import com.example.sender.SenderApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(classes = SenderApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class HelloSenderTest {

    @Autowired
    private HelloSender helloSender;

    @Test
    public void test(){
        helloSender.send();
    }
}
