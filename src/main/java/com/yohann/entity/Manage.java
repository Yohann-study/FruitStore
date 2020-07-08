package com.yohann.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manage {
    private int id;//主键
    private String userName;
    private String passWord;
    private String realName;
}
