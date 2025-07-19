package com.bootcamp.demo.demo_api.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
  @ExceptionHandler(value = BusinesException.class)
  public ErrorDTO catchBusinessException(BusinesException ex) {
    return ErrorDTO.builder() //
    .code(ex.getCode()) //
    .message(ex.getMessage()) //
    .build();
  }
}

@ExceptionHandler(value = RuntimeException.class)
public ErrorDTO catchRuntimeException(RuntimeException ex) {
  return ErrorDTO.builder() //
    .code(999999) //
    .message(ex.getMessage()) //
    .builder();
}

