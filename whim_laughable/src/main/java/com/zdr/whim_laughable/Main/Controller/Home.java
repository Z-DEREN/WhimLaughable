package com.zdr.whim_laughable.Main.Controller;

import com.zdr.whim_laughable.Main.ServiceDaoImpl.Model.MUser;
import com.zdr.whim_laughable.Main.ServiceDaoImpl.ServiceImpl.MINavigation;
import com.zdr.whim_laughable.Tool.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.zdr.whim_laughable.Main.ServiceDaoImpl.ServiceImpl.MINavigation;

@RestController
public class Home {

    @Autowired
    private Tool tool;
    @Autowired
    private MINavigation MINavigation;

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







    /**
     * 公共登录页
     * @param model
     * @param request
     * @return
     *
     * 权限:无需权限
     */
    @RequestMapping(value = "/login1")
    public Object userloginN1(ModelAndView model , HttpServletRequest request) {
        String lastUrl = request.getHeader("Referer");
        System.out.println("进入登录页;从"+lastUrl+"地址访问");
        model.addObject("Time", tool.GetNewDateTime(2));
        model.setViewName("mass_oriented/login/Login1");
        return model;
    }

    /**
     * 公共登录页
     * @param model
     * @param request
     * @return
     *
     * 权限:无需权限
     */
    @RequestMapping(value = "/login2")
    public Object userloginN2(ModelAndView model , HttpServletRequest request) {
        String lastUrl = request.getHeader("Referer");
        System.out.println("进入登录页;从"+lastUrl+"地址访问");
        model.addObject("Time", tool.GetNewDateTime(2));
        model.setViewName("mass_oriented/login/Login2");
        return model;
    }

    /**
     * 公共登录页
     * @param model
     * @param request
     * @return
     *
     * 权限:无需权限
     */
    @RequestMapping(value = "/login3")
    public Object userloginN3(ModelAndView model , HttpServletRequest request) {
        String lastUrl = request.getHeader("Referer");
        System.out.println("进入登录页;从"+lastUrl+"地址访问");
        model.addObject("Time", tool.GetNewDateTime(2));
        model.setViewName("mass_oriented/login/Login3");
        return model;
    }

    @RequestMapping(value = "/userhome1")
    public Object userhome1(ModelAndView model , HttpServletRequest request) {
        String lastUrl = request.getHeader("Referer");
        System.out.println("进入登录页;从"+lastUrl+"地址访问");
        model.addObject("Time", tool.GetNewDateTime(2));
        model.setViewName("mass_oriented/homepage/home1");
        return model;
    }


    /**
     * 公共登录页
     * @param model
     * @param request
     * @return
     *
     * 权限:无需权限
     */
    @RequestMapping(value = "/header")
    public Object header(ModelAndView model , HttpServletRequest request) {
        String lastUrl = request.getHeader("Referer");
        System.out.println("进入登录页;从"+lastUrl+"地址访问");
        model.addObject("Time", tool.GetNewDateTime(2));
        model.setViewName("mass_oriented/Header/Header");
        return model;
    }

    /**
     * 写博客页
     * @param model
     * @param request
     * @return
     */
    @RequestMapping(value = "/creation")
    public Object creation(ModelAndView model , HttpServletRequest request) {
        String lastUrl = request.getHeader("Referer");
        System.out.println("进入登录页;从"+lastUrl+"地址访问");
        model.addObject("Time", tool.GetNewDateTime(2));
        model.setViewName("mass_oriented/homepage/writecreation");
        return model;
    }



    /**
     * 获取通用头部
     * @param model
     * @return
     */
    @RequestMapping("/head")
    public Object head(ModelAndView model, HttpServletRequest request ){
        String lastUrl = request.getHeader("Referer");
        System.out.println("进入登录页;从"+lastUrl+"地址访问");
        model.setViewName("mass_oriented/Header/Header2");
        MUser muser = new MUser();
        muser = MINavigation.visituserdata(muser);

        System.out.println(muser.getNAME());
        System.out.println(muser.getUserimg());
        //用户信息
        model.addObject("UserName", muser.getNAME());
        model.addObject("Userheadpor", muser.getUserimg());
        model.addObject("TypeList", MINavigation.navigation());
        return model;
    }

    /**
     * 导航栏跳转
     * @param model
     * @param table
     * @return
     */
    @RequestMapping(value = "/navigation")
    public Object navigation(ModelAndView model,HttpServletRequest request ,@RequestParam(value = "table", required = false) String table) {
        System.out.println(table);
        String lastUrl = request.getHeader("Referer");
        System.out.println("进入登录页;从"+lastUrl+"地址访问");
        model.setViewName("redirect:mass_oriented/homepage/"+table);
        return model;
    }


    @RequestMapping(value = "/writecreation")
    public Object writecreation(ModelAndView model , HttpServletRequest request) {
        String lastUrl = request.getHeader("Referer");
        System.out.println("进入登录页;从"+lastUrl+"地址访问");
        model.addObject("Time", tool.GetNewDateTime(2));
        model.setViewName("mass_oriented/homepage/writecreation");
        return model;
    }





    /**
     * 公共登录页
     * @param model
     * @param request
     * @return
     *
     * 权限:无需权限
     */
    @RequestMapping(value = "/Subwindow")
    public Map<String,Object> Subwindow(HttpServletRequest request,@RequestBody Object obj) {
        Map<String,Object> resultMap = new HashMap<String,Object>();
        Map<String,Object> map = (Map<String,Object>)obj;
        String lastUrl = request.getHeader("Referer");
        System.out.println("从"+lastUrl+"地址访问");
        System.out.println(map.get("username"));
        System.out.println(map.get("passworld"));
        resultMap.put("success", 1);
        resultMap.put("message", "上传成功");
        resultMap.put("url", "fileUrl");
        return resultMap;
    }













}
