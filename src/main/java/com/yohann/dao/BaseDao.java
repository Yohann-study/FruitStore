package com.yohann.dao;

import java.util.List;
import java.util.Map;

/**
 * 基础dao封装一些简单的方法
 * @param <T>
 */
public interface BaseDao<T>{
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

    /**
     * 查询数据条数
     * @return
     */
    long count();

    /**
     * 分页查询
     * @param map
     * @return
     */
    List<T> findByPager(Map<String, Object> map);

    /**
     * 模糊搜索
     * @return
     */
    List<T> findLike(Map<String, Object> map);
}
