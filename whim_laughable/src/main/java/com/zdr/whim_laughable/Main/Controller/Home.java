package com.zdr.whim_laughable.Main.Controller;

import com.zdr.whim_laughable.Tool.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public Object home(ModelAndView model) {
        System.out.println("进入系统");
        model.addObject("Time", tool.GetNewDateTime(2));
        model.setViewName("administrator/universal/home");
        return model;
    }




}
