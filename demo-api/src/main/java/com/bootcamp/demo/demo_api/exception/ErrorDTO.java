package com.bootcamp.demo.demo_api.exception;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ErrorDTO {
  private String code;
  private String message; 
}
