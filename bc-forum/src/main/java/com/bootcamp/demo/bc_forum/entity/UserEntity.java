package com.bootcamp.demo.bc_forum.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column(nullable = false, name = "user_name")
  private String username;
  @Column(nullable = false)
  private String email;
  @Column(nullable = false)
  private String address;
  @Column(nullable = false)
  private String phone;
  @Column(nullable = false)
  private String website;
  @Column(nullable = false)
  private String company;
}
