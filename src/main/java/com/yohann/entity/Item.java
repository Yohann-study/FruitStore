package com.yohann.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {

  private long id;
  private String name;
  private String price;
  private long scNum;
  private long gmNum;
  private String url1;
  private String url2;
  private String url3;
  private String url4;
  private String url5;
  private String ms;
  private String pam1;
  private String pam2;
  private String pam3;
  private String val3;
  private String val2;
  private String val1;
  private long type;
  private long zk;
  private long categoryIdOne;
  private ItemCategory category1;
  private long categoryIdTwo;
  private ItemCategory category2;
  private long isDelete;
}
