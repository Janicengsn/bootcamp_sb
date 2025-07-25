package com.bootcamp.demo.demo_api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bootcamp.demo.demo_api.entity.CommentEntity;
import com.bootcamp.demo.demo_api.entity.PostEntity;
import com.bootcamp.demo.demo_api.entity.UserEntity;
import com.bootcamp.demo.demo_api.model.dto.UserDTO;

// localhost:8080/user?names=john,peter,vincent
// "john,peter,vincent"
// String names -> List<String>

public interface JPOperation {
  @GetMapping(value = "/jph/users") // 冇新增, 冇改動野. Get = read + return; otherwise PostMapping
  List<UserDTO> getAllJPUsers();

  @GetMapping(value = "/jph/database/users")
  List<UserEntity> getAndSaveUsers();

  @PostMapping(value = "/jph/database/posts")
  List<PostEntity> getAndSavePosts();

  @PostMapping(value = "/jph/database/comments")
  List<CommentEntity> getAndSaveComments();

  @GetMapping(value = "/jph/posts")
  List<PostEntity> getPostsByUserId(@RequestParam(value = "uid") Long userId);
}
