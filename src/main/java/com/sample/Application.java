package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {



  public static void main(String[] args) {
    // Launch the application
    ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

    MessageSender sender = context.getBean(MessageSender.class);

    // Send a message with a POJO - the template reuse the message converter
    System.out.println("Sending an email message.");

    try {
      sender.send();
    } catch (Exception e){
      System.out.println("Error");
    }

  }

}