package com.tutorialspoint.event;

public class HelloWorldAgain {
  private String message;

  public void setMessage(String message) {
    this.message = message;
  }

  public void getMessage() {
    System.out.println("Your Message : " + message);
  }
}
