package com.yohann.utils;

import lombok.Data;
import java.util.List;

/**
 * 页面管理工具类
 */
@Data
public class Pager<T> {
	private int pageNo;//分页起始页
	private int pageSize = 10;//每页记录数
	private List<T> rows;//查询到的数据集合
	private long total;//总页数
}