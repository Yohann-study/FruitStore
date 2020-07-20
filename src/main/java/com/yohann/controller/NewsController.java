package com.yohann.controller;

import com.yohann.entity.News;
import com.yohann.service.NewsService;
import com.yohann.utils.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Timestamp;
import java.util.Date;

/**
 * 用户管理控制器
 */
@Controller
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private NewsService newsService;

    @RequestMapping("news")
    public String findAll(Model model, Pager pager, News news){
        //将页码设置为1
        pager = pager.pageNoTo0(pager);

        Pager<News> result = new Pager<>();
        result.setPageNo(pager.getPageNo());
        result.setPageSize(pager.getPageSize());
        if (news.getName() == null)
            result.setRows(newsService.findByPager(pager));
        else
            result.setRows(newsService.findLike(pager, news.getName()));

        //计算页数
        result.setTotal(result.ComputationalPages(newsService.count(),result.getPageSize()));

        model.addAttribute("result", result);

        return "news/news";
    }

    /**
     * 跳转到添加页面
     */
    @RequestMapping("/add")
    public String add(){
        return "news/add";
    }

    /**
     * 添加执行
     */
    @RequestMapping("/exAdd")
    public String exAdd(News news){
        Date utilDate = new Date();
        news.setAddTime(new Timestamp(utilDate.getTime()));
        newsService.insert(news);

        return "redirect:/news/news";
    }

    /**
     * 修改
     */
    @RequestMapping("update")
    public String update(int id,Model model){
        model.addAttribute("result", newsService.findById(id));

        return "news/update";
    }

    /**
     * 执行更新操作
     */
    @RequestMapping("exUpdate")
    public String exUpdate(News news){
        Date utilDate = new Date();
        news.setAddTime(new Timestamp(utilDate.getTime()));
        newsService.update(news);

        return "redirect:/news/news";
    }

    /**
     * 删除
     */
    @RequestMapping("delete")
    public String delete(int id){
        newsService.deleteById(id);

        return "redirect:/news/news";
    }
}
