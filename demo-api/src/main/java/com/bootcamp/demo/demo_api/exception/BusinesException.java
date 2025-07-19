package com.bootcamp.demo.demo_api.exception;

import lombok.Getter;

// ! For spring boot, usually we use "unchecked' exception
// because we have Global Exception HAndling (RestControllerAdvise)
@Getter
public class BusinesException extends RuntimeException {
  private int code;

  public BusinesException(SysError sysError) {
    super(sysError.getMessage());
    this.code = sysError.getCode();
  }

  // private UserNotFoundException(int code, String message) {
  // super(message);
  // this.code = code;
  // }
}
