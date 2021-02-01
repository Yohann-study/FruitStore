package com.yohann.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {

  private long id;
  private long itemId;
  private long userId;
  private long num;
  private double price;
  private String total;
}
