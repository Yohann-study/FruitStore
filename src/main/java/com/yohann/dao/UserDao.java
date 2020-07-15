package com.yohann.dao;

import com.yohann.entity.User;

import java.util.List;
import java.util.Map;

public interface UserDao extends BaseDao<User> {
    /**
     * 模糊搜索用户名
     * @return
     */
    List<User> findLike(Map<String, Object> map);
}
