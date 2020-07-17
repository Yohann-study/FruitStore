package com.yohann.controller;

import com.yohann.entity.Item;
import com.yohann.entity.ItemCategory;
import com.yohann.service.ItemCategoryService;
import com.yohann.service.ItemService;
import com.yohann.utils.Pager;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * 商品管理控制器
 */
@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @Autowired
    private ItemCategoryService itemCategoryService;

    @RequestMapping("item")
    public String findAll(Model model, Pager pager){
        //将页码设置为1
        pager = pager.pageNoTo0(pager);
        pager.setPageSize(5);

        Pager<Item> result = new Pager<>();
        result.setPageNo(pager.getPageNo());
        result.setPageSize(pager.getPageSize());
        result.setRows(itemService.findByPager(pager));

        //计算页数
        result.setTotal(result.ComputationalPages(itemService.count(),result.getPageSize()));

        model.addAttribute("result", result);

        return "item/item";
    }

    /**
     * 新增商品
     * @return
     */
    @RequestMapping("add")
    public String Add(Model model){
        List<ItemCategory> itemCategories = itemCategoryService.findAllSecondDirectory2();
        model.addAttribute("itemCategories2",itemCategories);

        return "item/add";
    }

    /**
     * 新增商品保存功能
     * @param request
     * @param file
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "exAdd", method = RequestMethod.POST)
    public String exAdd(HttpServletRequest request, @RequestParam(value = "file", required = false) MultipartFile file) throws IOException {

        return "redirect:/item/item.action";
    }
}
