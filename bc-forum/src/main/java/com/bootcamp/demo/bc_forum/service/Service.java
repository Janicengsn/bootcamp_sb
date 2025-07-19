package com.bootcamp.demo.bc_forum.service;

import java.util.List;

import com.bootcamp.demo.bc_forum.entity.CommentEntity;
import com.bootcamp.demo.bc_forum.entity.PostEntity;
import com.bootcamp.demo.bc_forum.entity.UserEntity;
import com.bootcamp.demo.bc_forum.model.UserDTO;

public interface Service {

 List<UserDTO> getUsers();
 List<UserEntity> getAndSaveUsers();
 List<PostEntity> getAndSavePosts();
 List<CommentEntity> getAndSaveComments();

 List<PostEntity> getPostsByUserId(Long userId);

 List<UserEntity> findAllUsers();
}
  

