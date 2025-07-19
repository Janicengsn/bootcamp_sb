package com.bootcamp.demo.demo_api.lib;

import org.springframework.web.util.UriComponentsBuilder;

public class UriManager {
  private UriComponentsBuilder uriComponentsBuilder;

  // ! Default / Encapsulate -> Constructor
  private UriManager() {
    this.uriComponentsBuilder = 
        UriComponentsBuilder.newInstance().scheme("http");
  }
  
  public Static UriManager newInstance() {
    return new UriManager();
  }
}
