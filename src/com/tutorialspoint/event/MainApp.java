package com.tutorialspoint.event;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
  public static void main(String[] args) {
    ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

    // Let us raise a start event.
    context.start();

    HelloWorldAgain obj = (HelloWorldAgain) context.getBean("helloWorldAgain");

    obj.getMessage();

    // Let us raise a stop event.
    context.stop();
  }
}
