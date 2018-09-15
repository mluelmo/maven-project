package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * 	Greet method.
   * 
   * @param someone - String
   * @return String - greet
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
