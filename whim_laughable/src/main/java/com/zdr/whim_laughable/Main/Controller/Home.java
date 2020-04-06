package com.zdr.whim_laughable.Main.Controller;

import com.zdr.whim_laughable.Tool.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@ResponseBody
@RequestMapping("/whim_laughable")
public class Home {

    @Autowired
    private Tool tool;
    /**
     * 主页导航页
     * @param model
     * @return
     */
    @RequestMapping(value = "/home1", method = RequestMethod.GET)
    public Object home1(ModelAndView model) {
        System.out.println("进入系统");

        model.addObject("Time", tool.GetNewDateTime(2));
        model.setViewName("administrator/universal/Rich_text_editor/DemoTextStyle");
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
