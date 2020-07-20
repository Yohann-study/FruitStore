package com.yohann.controller;

import com.yohann.entity.Item;
import com.yohann.entity.ItemCategory;
import com.yohann.service.ItemCategoryService;
import com.yohann.service.ItemService;
import com.yohann.utils.Images;
import com.yohann.utils.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

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
     * @param files
     * @param item
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "exAdd", method = RequestMethod.POST)
    public String exAdd(HttpServletRequest request, @RequestParam(value="file",required=false) MultipartFile[] files, Item item) throws IOException {
        item = saveImg(item, request, files);
        item.setGmNum(0);
        item.setIsDelete(0);
        item.setScNum(0);
        item.setCategoryIdOne(itemCategoryService.findById((int) item.getCategoryIdTwo()).getPid());
        itemService.insert(item);

        return "redirect:/item/item.action";
    }

    /**
     * 删除商品
     * @param id
     * @return
     */
    @RequestMapping("delete")
    public String delete(int id){
        itemService.deleteById(id);
        return "redirect:/item/item.action";
    }

    /**
     * 修改视频
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("update")
    public String update(int id,Model model){
        model.addAttribute("result", itemService.findById(id));
        model.addAttribute("itemCategories2",itemCategoryService.findAllSecondDirectory2());

        return "item/update";
    }

    /**
     * 执行更新操作
     * @param item
     * @param request
     * @param files
     * @return
     */
    @RequestMapping("exUpdate")
    public String exUpdate(Item item, HttpServletRequest request, @RequestParam(value="file",required=false) MultipartFile[] files) throws IOException {
        item = saveImg(item, request, files);
        item.setCategoryIdOne(itemCategoryService.findById((int) item.getCategoryIdTwo()).getPid());
        itemService.update(item);

        return "redirect:/item/item.action";
    }

    public Item saveImg(Item item, HttpServletRequest request, MultipartFile[] files) throws IOException {
        //获取项目根目录
        String contextPath = request.getServletContext().getRealPath("/");
        String[] contextPaths = contextPath.split("target");
        String rootPath = contextPaths[0];

        //保存路径
        String path = rootPath + Images.SAVE_PATH + "/items";

        // 如果目录不存在则创建
        File uploadDir = new File(path);
        if (!uploadDir.exists()) {
            uploadDir.mkdir();
        }

        //定义序号
        int count=1;
        for (MultipartFile file : files) {
            if (!file.isEmpty()) {
                //获取扩展名
                String extName = Images.getExtName(file.getOriginalFilename());

                //新的文件名字
                String newFileName = Images.rename() + extName;

                //封装上传文件位置的全路径
                File targetFile = new File(path, newFileName);

                //把本地文件上传到封装上传文件位置的全路径
                file.transferTo(targetFile);

                //服务器端
                //封装上传文件位置的全路径
                File targetFile2 = new File(contextPath+Images.GET_PATH, newFileName);

                //把本地文件上传到封装上传文件位置的全路径
                file.transferTo(targetFile2);

                if(count==1){
                    item.setUrl1(newFileName);
                }else if(count==2){
                    item.setUrl2(newFileName);
                }else if(count==3){
                    item.setUrl3(newFileName);
                }else if(count==4){
                    item.setUrl4(newFileName);
                }else if(count==5){
                    item.setUrl5(newFileName);
                }
            }
            count++;
        }

        return item;
    }
}
