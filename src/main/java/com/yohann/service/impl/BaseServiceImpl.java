package com.yohann.service.impl;

import com.yohann.dao.BaseDao;
import com.yohann.service.BaseService;

import java.util.List;

public  abstract class BaseServiceImpl<T> implements BaseService<T>{
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
}
