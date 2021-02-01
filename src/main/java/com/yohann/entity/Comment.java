package com.yohann.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

  private long id;
  private long userId;
  private long itemId;
  private String content;
  private java.sql.Timestamp addTime;
}
