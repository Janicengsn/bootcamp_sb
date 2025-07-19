package com.bootcamp.demo.demo_jpa.service;

import java.util.List;

import com.bootcamp.demo.demo_jpa.entity.StaffEntity;


// Normal Java

public interface StaffService {
  StaffEntity save(StaffEntity staffEntity); // save = insert + update
  StaffEntity findById(Long id);
  List<StaffEntity> findAll();
  Boolean deleteById(Long id);
  StaffEntity updateById(Long id, StaffEntity staffEntity);
  StaffEntity updateNameById(Long id, String name);
}
