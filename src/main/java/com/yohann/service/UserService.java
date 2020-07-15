package com.yohann.service;

import com.yohann.entity.User;
import com.yohann.utils.Pager;

import java.util.List;
import java.util.Map;

public interface UserService extends BaseService<User> {
    /**
     * 模糊搜索用户名
     * @return
     */
    List<User> findLike(Pager pager, User user);
}
