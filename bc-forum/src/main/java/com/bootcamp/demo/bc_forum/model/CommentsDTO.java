package com.bootcamp.demo.bc_forum.model;

import lombok.Getter;

@Getter
public class CommentsDTO {
  private long postid;
  private long id;
  private String name;
  private String email;
  private String body;
}
