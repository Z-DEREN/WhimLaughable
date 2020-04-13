package com.zdr.whim_laughable.Main.Controller;


import com.zdr.whim_laughable.Tool.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PageJumps {


    @Autowired
    private Tool tool;





    /**
     * 公共展示页
     * @param model
     * @param request
     * @return
     *
     * 权限:无需权限
     */
    @RequestMapping(value = "/")
    public Object Hpublicity(ModelAndView model , HttpServletRequest request) {
        String lastUrl = request.getHeader("Referer");
        System.out.println("进入公共展示页;从"+lastUrl+"地址访问");
        model.setViewName("mass_oriented/Hpublicity");
        return model;
    }

    /**
     * 跳转写博客
     * @param model
     * @return
     *
     * 权限:作者
     */
    @RequestMapping(value = "/creationessay")
    public Object creationessay(ModelAndView model , HttpServletRequest request) {
        String lastUrl = request.getHeader("Referer");
        System.out.println("进入写博客"+lastUrl);
        model.setViewName("mass_oriented/DemoTextPost");
        return model;
    }

    /**
     * 博文管理
     * @param model
     * @return
     *
     * 权限:作者
     */
    @RequestMapping(value = "/managementessay")
    public Object managementessay(ModelAndView model , HttpServletRequest request) {
        String lastUrl = request.getHeader("Referer");
        System.out.println("管理博客"+lastUrl);
        model.setViewName("mass_oriented/managementessay");
        return model;
    }













}
