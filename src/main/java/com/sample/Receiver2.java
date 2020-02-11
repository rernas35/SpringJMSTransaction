package com.sample;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver2 {

  @JmsListener(destination = "mailbox2", containerFactory = "myFactory")
  public void receiveMessage(Email email) {
    System.out.println("Received2 <" + email + ">");
  }

}