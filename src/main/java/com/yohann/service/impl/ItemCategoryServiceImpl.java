package com.yohann.service.impl;

import com.yohann.dao.BaseDao;
import com.yohann.dao.ItemCategoryDao;
import com.yohann.entity.ItemCategory;
import com.yohann.service.ItemCategoryService;
import com.yohann.utils.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ItemCategoryServiceImpl extends BaseServiceImpl<ItemCategory> implements ItemCategoryService {
    @Autowired
    private ItemCategoryDao itemCategoryDao;

    @Override
    public BaseDao<ItemCategory> getBaseDao() {
        return itemCategoryDao;
    }

    /**
     * 查询一级目录
     *
     * @param pager
     * @return
     */
    @Override
    public List<ItemCategory> findFirstDirectory(Pager pager) {
        Map<String, Object> map = new HashMap();
        map.put("starIndex", (pager.getPageNo() - 1) * pager.getPageSize());
        map.put("pageSize", pager.getPageSize());
        return this.itemCategoryDao.findFirstDirectory(map);
    }

    /**
     * 查询二级目录
     *
     * @param pager
     * @param itemCategory
     * @return
     */
    @Override
    public List<ItemCategory> findSecondDirectory(Pager pager, ItemCategory itemCategory) {
        Map<String, Object> map = new HashMap();
        map.put("starIndex", (pager.getPageNo() - 1) * pager.getPageSize());
        map.put("pageSize", pager.getPageSize());
        map.put("pid", itemCategory.getId());
        return itemCategoryDao.findSecondDirectory(map);
    }

    @Override
    public long countFirstDirectory() {
        return itemCategoryDao.countFirstDirectory();
    }

    @Override
    public long countSecondDirectory(ItemCategory itemCategory) {
        Map<String, Object> map = new HashMap();
        map.put("pid", itemCategory.getId());
        return itemCategoryDao.countSecondDirectory(map);
    }

    @Override
    public void deleteFirstDirectory(int id) {
        itemCategoryDao.deleteFirstDirectory(id);
    }

    @Override
    public void deleteSecondDirectory(int pid) {
        itemCategoryDao.deleteSecondDirectory(pid);
    }

    @Override
    public List<ItemCategory> findAllFirstDirectory() {
        return itemCategoryDao.findAllFirstDirectory();
    }

    @Override
    public List<ItemCategory> findAllSecondDirectory(ItemCategory itemCategory) {
        Map<String, Object> map = new HashMap();
        map.put("pid", itemCategory.getId());

        return itemCategoryDao.findAllSecondDirectory(map);
    }

    @Override
    public List<ItemCategory> findAllSecondDirectory2() {
        return itemCategoryDao.findAllSecondDirectory2();
    }
}

