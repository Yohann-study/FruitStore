package com.yohann.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class News {

  private long id;
  private String name;
  private String content;
  private java.sql.Timestamp addTime;
}
