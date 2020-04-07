package com.zdr.whim_laughable.Main.Controller;

import com.zdr.whim_laughable.Tool.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class Home {

    @Autowired
    private Tool tool;

    /**
     * 主页导航页
     * @param model
     * @return
     */
    @RequestMapping(value = "/")
    public Object Hpublicity(ModelAndView model , HttpServletRequest request) {
        String lastUrl = request.getHeader("Referer");
        System.out.println("进入系统"+lastUrl);
        model.addObject("Time", tool.GetNewDateTime(2));
        model.setViewName("administrator/he/Hpublicity");
        return model;
    }

    /**
     * 主页导航页
     * @param model
     * @return
     */
    @RequestMapping(value = "/creationessay")
    public Object creationessay(ModelAndView model , HttpServletRequest request) {
        String lastUrl = request.getHeader("Referer");
        System.out.println("进入写博客"+lastUrl);
        model.addObject("Time", tool.GetNewDateTime(2));
        model.setViewName("administrator/universal/Rich_text_editor/DemoText");
        return model;
    }


    /**
     * 主页导航页
     * @param model
     * @return
     */
    @RequestMapping(value = "/managementessay")
    public Object managementessay(ModelAndView model , HttpServletRequest request) {
        String lastUrl = request.getHeader("Referer");
        System.out.println("管理博客"+lastUrl);
        model.addObject("Time", tool.GetNewDateTime(2));
        model.setViewName("administrator/I/managementessay");
        return model;
    }










    /**
     * 主页导航页
     * @param model
     * @return
     */
    @GetMapping(value = "/home1")
    public Object home1(ModelAndView model) {
        System.out.println("进入系统");
        model.addObject("Time", tool.GetNewDateTime(2));
        model.setViewName("administrator/universal/button/cybertruckButton");
        return model;
    }

    /**
     * 主页导航页
     * @param model
     * @return
     */
    @RequestMapping(value = "/home2", method = RequestMethod.GET)
    public Object home2(ModelAndView model) {
        System.out.println("进入系统");
        model.addObject("Time", tool.GetNewDateTime(2));
        model.setViewName("administrator/universal/Rich_text_editor/DemoText");
        return model;
    }

    /**
     * 主页导航页
     * @param model
     * @return
     */
    @RequestMapping(value = "/home3", method = RequestMethod.GET)
    public Object home3(ModelAndView model) {
        System.out.println("进入系统");
        model.addObject("Time", tool.GetNewDateTime(2));
        model.setViewName("administrator/universal/Rich_text_editor/DemoText");
        return model;
    }

    /**
     * 主页导航页
     * @param model
     * @return
     */
    @RequestMapping(value = "/home4", method = RequestMethod.GET)
    public Object home4(ModelAndView model) {
        System.out.println("进入系统");
        model.addObject("Time", tool.GetNewDateTime(2));
        model.setViewName("administrator/universal/Rich_text_editor/DemoTextPost");
        return model;
    }


    /**
     * 文本提交方法
     * @param model
     * @return
     */
    @RequestMapping(value = "/postText", method = RequestMethod.POST)
    public Object postText(ModelAndView model ,@RequestBody Object request) {
        System.out.println("提交");
        System.out.println(request);
        Map<String,Object> map = (Map<String,Object>)request;
        System.out.println("names:"+map.get("names"));
        System.out.println("sex:"+map.get("sex"));
        System.out.println("text:"+map.get("text"));

        model.addObject("Time", tool.GetNewDateTime(2));
        model.setViewName("administrator/universal/Rich_text_editor/DemoText");
        return model;
    }



}
