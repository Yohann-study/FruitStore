package com.yohann.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {

  private long id;
  private long itemId;
  private Item item;
  private long orderId;
  private long status;
  private long num;
  private String total;
}
