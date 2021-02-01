package com.yohann.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

  private long id;
  private String userName;
  private String passWord;
  private String phone;
  private String realName;
  private String sex;
  private String address;
  private String email;
}
