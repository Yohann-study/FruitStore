package com.yohann.utils;

import lombok.Data;
import java.util.List;

/**
 * 页面管理工具类
 */
@Data
public class Pager {
	private int page;//分页起始页
	private int size = 15;//每页记录数
}