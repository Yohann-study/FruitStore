package com.yohann.service;

import com.yohann.entity.ItemCategory;
import com.yohann.utils.Pager;

import java.util.List;
import java.util.Map;

public interface ItemCategoryService extends BaseService<ItemCategory> {
    /**
     * 查询一级目录
     * @return
     */
    List<ItemCategory> findFirstDirectory(Pager pager);

    /**
     * 查询二级目录
     * @return
     */
    List<ItemCategory> findSecondDirectory(Pager pager, ItemCategory itemCategory);

    /**
     * 统计一级分类
     * @return
     */
    long countFirstDirectory();

    /**
     * 统计二级分类
     * @return
     */
    long countSecondDirectory(ItemCategory itemCategory);

    /**
     * 删除一级分类
     */
    void deleteFirstDirectory(int id);

    /**
     * 删除二级分类
     */
    void deleteSecondDirectory(int id);
}
