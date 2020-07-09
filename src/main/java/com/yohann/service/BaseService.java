package com.yohann.service;

import com.yohann.dao.BaseDao;

import java.util.List;

/**
 * 服务层接口基类
 * @param <T>
 */
public interface BaseService<T>{
    /**
     * 查询所有信息
     * @return
     */
    List<T> findAll();

    /**
     * 查询一个对象
     * @param t
     * @return
     */
    T findEntity(T t);

    /**
     * 通过ID查询信息
     * @param id
     * @return
     */
    T findById(int id);

    /**
     * 插入一条信息
     * @param t
     */
    void insert(T t);

    /**
     * 通过ID删除信息
     * @param id
     */
    void deleteById(int id);

    /**
     * 更新一条信息
     */
    void update(T t);
}
