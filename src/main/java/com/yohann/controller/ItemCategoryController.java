package com.yohann.controller;

import com.yohann.entity.ItemCategory;
import com.yohann.service.ItemCategoryService;
import com.yohann.utils.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;

import java.util.List;

/**
 * 类目管理控制器
 */
@Controller
@RequestMapping("/itemCategory")
public class ItemCategoryController{

    @Autowired
    private ItemCategoryService itemCategoryService;

    /**
     * 一级类目管理
     * @param model
     * @param pager
     * @return
     */
    @RequestMapping("itemCategory")
    public String findAll(Model model,Pager pager){
        //将页码设置为1
        pager = pager.pageNoTo0(pager);

        Pager<ItemCategory> result = new Pager<>();
        result.setPageNo(pager.getPageNo());
        result.setPageSize(pager.getPageSize());
        result.setRows(itemCategoryService.findFirstDirectory(pager));

        //计算页数
        result.setTotal(result.ComputationalPages(itemCategoryService.countFirstDirectory(),result.getPageSize()));

        model.addAttribute("result", result);

        return "itemCategory/itemCategory";
    }

    /**
     * 新增分类
     * @return
     */
    @RequestMapping("add")
    public String Add(){
        return "itemCategory/add";
    }

    /**
     * 新增一级类目保存功能
     * @param itemCategory
     * @return
     */
    @RequestMapping("exAdd")
    public String exAdd(ItemCategory itemCategory){
        itemCategoryService.insert(itemCategory);

        return "redirect:/itemCategory/itemCategory.action";
    }


    /**
     * 删除类目
     * @param itemCategory
     * @return
     */
    @RequestMapping("delete")
    public String delete(ItemCategory itemCategory){
        //删除本身
        itemCategoryService.deleteFirstDirectory((int)itemCategory.getId());

        //将下级也删除
        itemCategoryService.deleteSecondDirectory((int)itemCategory.getId());

        return "redirect:/itemCategory/itemCategory.action";
    }

    /**
     * 转向到修改一级类目页面
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("update")
    public String update(Integer id,Model model){
        ItemCategory itemCategory = itemCategoryService.findById(id);
        model.addAttribute("obj",itemCategory);

        return "itemCategory/update";
    }

    /**
     * 修改一级类目
     * @param itemCategory
     * @return
     */
    @RequestMapping("exUpdate")
    public String exUpdate(ItemCategory itemCategory){
        itemCategoryService.update(itemCategory);

        return "redirect:/itemCategory/itemCategory.action";
    }

    /**
     * 二级目录
     * @param model
     * @param pager
     * @param itemCategory
     * @return
     */
    @RequestMapping("itemCategory2")
    public String findAll2(Model model,Pager pager,ItemCategory itemCategory){
        //将页码设置为1
        pager = pager.pageNoTo0(pager);

        Pager<ItemCategory> result = new Pager<>();
        result.setPageNo(pager.getPageNo());
        result.setPageSize(pager.getPageSize());
        result.setRows(itemCategoryService.findSecondDirectory(pager, itemCategory));

        //计算页数
        result.setTotal(result.ComputationalPages(itemCategoryService.countSecondDirectory(itemCategory),result.getPageSize()));

        model.addAttribute("result", result);
        model.addAttribute("pid", itemCategory.getId());

        return "itemCategory/itemCategory2";
    }

    /**
     * 转向到新增二级类目页面
     * @param pid
     * @param model
     * @return
     */
    @RequestMapping("add2")
    public String add2(int pid,Model model){
        model.addAttribute("pid",pid);
        return "itemCategory/add2";
    }

    /**
     * 新增二级类目保存功能
     * @param itemCategory
     * @return
     */
    @RequestMapping("exAdd2")
    public String exAdd2(ItemCategory itemCategory){
        itemCategoryService.insert(itemCategory);

        return "redirect:/itemCategory/itemCategory2.action?id="+itemCategory.getPid();
    }

    /**
     * 转向到修改二级类目页面
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("update2")
    public String update2(Integer id,Model model){
        ItemCategory itemCategory = itemCategoryService.findById(id);
        model.addAttribute("obj",itemCategory);
        return "itemCategory/update2";
    }

    /**
     * 修改二级类目
     * @param itemCategory
     * @return
     */
    @RequestMapping("exUpdate2")
    public String exUpdate2(ItemCategory itemCategory){
        itemCategoryService.update(itemCategory);

        return "redirect:/itemCategory/itemCategory2.action?id="+itemCategory.getPid();
    }

    /**
     * 删除二级类目
     * @param itemCategory
     * @return
     */
    @RequestMapping("delete2")
    public String delete2(ItemCategory itemCategory){
        //删除本身
        itemCategoryService.deleteFirstDirectory((int)itemCategory.getId());

        return "redirect:/itemCategory/itemCategory2.action?id="+itemCategory.getPid();
    }
}
