package com.bootcamp.demo.bc_forum.model;

import lombok.Getter;

@Getter
public class UserDTO {
  private long id;
  private String username;
  private String email;
  private String address;
  private String phone;
  private String website;
  private String company;


@Getter
public static class Address {
  private String street;
  private String suite;
  private String city;
  private String zipcode;
  private Geo geo;
}

@Getter
public static class Geo {
  private String Lat;
  private String Lng;
}

@Getter
public static class Company {
  private String name;
  private String catchPhrase;
  private String bs;
}
}
