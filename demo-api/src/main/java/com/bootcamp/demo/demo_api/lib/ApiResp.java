package com.bootcamp.demo.demo_api.lib;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ApiResp<T> {
  private int code;
  private String message;
  private T data;

  public static void main(String[] args) {
    ApiResp<String> apiResp1 = ApiResp.<String>builder() //
    .code(999998) //
    .message("abcdf") //
    .data("Vincent") //
    .builder();
  }
}
