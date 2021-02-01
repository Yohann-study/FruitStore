package com.yohann.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemOrder {

  private long id;
  private long itemId;
  private long userId;
  private User user;
  private String code;
  private java.sql.Timestamp addTime;
  private String total;
  private long isDelete;
  private long status;
  private List<OrderDetail> details;
}
