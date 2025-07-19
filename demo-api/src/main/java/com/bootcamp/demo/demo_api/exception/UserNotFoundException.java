package com.bootcamp.demo.demo_api.exception;

// ! For spring boot, usually we use "unchecked" exception

public class UserNotFoundException extends RuntimeException {
  private int code;

  public UserNotFoundException(int code, String message)
}
