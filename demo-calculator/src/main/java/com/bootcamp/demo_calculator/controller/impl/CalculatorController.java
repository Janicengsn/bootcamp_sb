package com.bootcamp.demo_calculator.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.demo_calculator.controller.CalculatorOperation;
import com.bootcamp.demo_calculator.model.Cat;

@RestController // ! @Controller + @ResponseBody
// @Controller // JSON, XML, HTML  **只有controller可以寫到GetMapping
// 
@ResponseBody // ! Must be JSON
public class CalculatorController implements CalculatorOperation {
  @Override
  public Integer sum(Integer x, Integer y) {
    return x + y;
  }

  @Override
  public Cat getCat(Integer age, String name) {
    return new Cat(name, age);
  }

  @Override
  public Cat getCat2(Integer age, String name) {
    return new Cat(name, age);
  }

  @Override
  public Integer subtract(Integer x, Integer y) {
    return x - y;
  }

  @Override
  public Cat getCat3(String name, Integer age) {
    return new Cat(name, age);
  }
}