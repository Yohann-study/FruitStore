package com.yohann.controller;

import com.yohann.entity.ItemCategory;
import com.yohann.service.ItemCategoryService;
import com.yohann.utils.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 类目管理控制器
 */
@Controller
@RequestMapping("/itemcategory")
public class ItemCategoryController extends BaseController {
    @Autowired
    private ItemCategoryService itemCategoryService;

    public String findAll(){
        Pager<ItemCategory> pager = itemCategoryService.findAll();
    }
}
