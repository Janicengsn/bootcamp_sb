package com.bootcamp.demo.bc_forum.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bootcamp.demo.bc_forum.entity.CommentEntity;
import com.bootcamp.demo.bc_forum.entity.PostEntity;
import com.bootcamp.demo.bc_forum.entity.UserEntity;
import com.bootcamp.demo.bc_forum.model.UserDTO;

public interface Operation {
  @GetMapping(value = )
  List<UserDTO> getAllUsers();

  @PostMapping
 List<UserEntity> getAndSaveUsers();
 List<PostEntity> getAndSavePosts();
 List<CommentEntity> getAndSaveComments();

 List<PostEntity> getPostsByUserId(Long userId);

 List<UserEntity> findAllUsers();
}
