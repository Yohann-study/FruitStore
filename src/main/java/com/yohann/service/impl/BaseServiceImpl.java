package com.yohann.service.impl;

import com.yohann.dao.BaseDao;
import com.yohann.service.BaseService;
import com.yohann.utils.Pager;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 服务层实现基类
 * @param <T>
 */
public  abstract class BaseServiceImpl<T> implements BaseService<T>{
    @Autowired
    private BaseDao<T> baseDao;
    public abstract BaseDao<T> getBaseDao();

    @Override
    public List<T> findAll() {
        return this.getBaseDao().findAll();
    }

    @Override
    public T findEntity(T t) {
        return this.getBaseDao().findEntity(t);
    }

    @Override
    public T findById(int id) {
        return this.getBaseDao().findById(id);
    }

    @Override
    public void insert(T t) {
        this.getBaseDao().insert(t);
    }

    @Override
    public void deleteById(int id) {
        this.getBaseDao().deleteById(id);
    }

    @Override
    public void update(T t) {
        this.getBaseDao().update(t);
    }

    @Override
    public long count() {
        return this.getBaseDao().count();
    }

    @Override
    public List<T> findByPager(Pager pager) {
        Map<String, Object> map = new HashMap();
        map.put("starIndex", (pager.getPageNo()-1) * pager.getPageSize());
        map.put("pageSize", pager.getPageSize());
        return this.getBaseDao().findByPager(map);
    }

    @Override
    public List<T> findLike(Pager pager, String key) {
        Map<String, Object> map = new HashMap();
        map.put("starIndex", (pager.getPageNo()-1) * pager.getPageSize());
        map.put("pageSize", pager.getPageSize());
        map.put("key", key);

        return this.getBaseDao().findLike(map);
    }
}
