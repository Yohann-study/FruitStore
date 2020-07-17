package com.yohann.dao;

import com.yohann.entity.ItemCategory;

import java.util.List;
import java.util.Map;

public interface ItemCategoryDao extends BaseDao<ItemCategory> {
    /**
     * 分页查询一级目录
     * @return
     */
    List<ItemCategory> findFirstDirectory(Map<String, Object> map);

    /**
     * 分页查询二级目录
     * @return
     */
    List<ItemCategory> findSecondDirectory(Map<String, Object> map);

    /**
     * 统计一级分类
     * @return
     */
    long countFirstDirectory();

    /**
     * 统计二级分类
     * @return
     */
    long countSecondDirectory(Map<String, Object> map);

    /**
     * 删除一级分类
     */
    void deleteFirstDirectory(int id);

    /**
     * 删除二级分类
     */
    void deleteSecondDirectory(int pid);

    /**
     * 查询一级目录
     * @return
     */
    List<ItemCategory> findAllFirstDirectory();

    /**
     * 查询二级目录
     * @return
     */
    List<ItemCategory> findAllSecondDirectory(Map<String, Object> map);

    /**
     * 查询二级目录
     * @return
     */
    List<ItemCategory> findAllSecondDirectory2();
}
