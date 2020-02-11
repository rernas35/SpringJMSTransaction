package com.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MessageSender {

    @Autowired
    JmsTemplate jmsTemplate;

    @Transactional
    public void send(){
        jmsTemplate.convertAndSend("mailbox", new Email("info@example.com", "Hello"));
        jmsTemplate.convertAndSend("mailbox2", new Email("info@example.com", "Hello"));
     //   throw new RuntimeException("sdasd");
    }
}
