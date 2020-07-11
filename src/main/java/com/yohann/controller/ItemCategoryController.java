package com.yohann.controller;

import com.yohann.entity.ItemCategory;
import com.yohann.service.ItemCategoryService;
import com.yohann.utils.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import java.util.List;

/**
 * 类目管理控制器
 */
@Controller
@RequestMapping("/itemcategory")
public class ItemCategoryController extends BaseController {

    @Autowired
    private ItemCategoryService itemCategoryService;

    @RequestMapping("itemcategory")
    public String findAll(Model model,Pager pager){
        if (pager.getPage() == 0){
            pager = new Pager();
            pager.setPage(1);
        }
        model.addAttribute("list", itemCategoryService.findByPager(pager));
        return "itemcategory/itemcategory";
    }

    @RequestMapping("page")
    public String findByPage(Pager pager, HttpServletRequest request){
        List<ItemCategory> itemCategories = itemCategoryService.findByPager(pager);
        request.setAttribute("itemCategories", itemCategories);
        return "itemcategory/itemcategory";
    }
}
