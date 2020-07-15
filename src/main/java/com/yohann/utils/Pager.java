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

	/**
	 * 将页码设置为1
	 * @param pager
	 * @return
	 */
	public Pager pageNoTo0(Pager pager){
		if (pager.getPageNo() == 0){
			pager.setPageNo(1);
		}

		return pager;
	}

	/**
	 * 计算页数
	 * @param rows
	 * @param pageSize
	 * @return
	 */
	public long ComputationalPages(List<T> rows, int pageSize){
		long total;
		if(rows.size()%pageSize == 0)
			total = rows.size()/pageSize;
		else
			total = rows.size()/pageSize+1;

		return total;
	}
}