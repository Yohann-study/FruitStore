package com.yohann.controller;

import com.yohann.entity.ItemCategory;
import com.yohann.service.ItemCategoryService;
import com.yohann.utils.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
        if (pager.getPageNo() == 0){
            pager = new Pager();
            pager.setPageNo(1);
        }
        Pager<ItemCategory> result = new Pager<>();
        result.setPageNo(pager.getPageNo());
        result.setPageSize(pager.getPageSize());
        result.setRows(itemCategoryService.findByPager(pager));
        result.setTotal(itemCategoryService.count()/pager.getPageSize()+1);

        model.addAttribute("result", result);

        return "itemcategory/itemcategory";
    }
}
