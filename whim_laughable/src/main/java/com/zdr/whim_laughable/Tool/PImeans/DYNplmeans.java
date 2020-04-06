package com.zdr.whim_laughable.Tool.PImeans;

import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.Set;


/**
 * 自动化方法
 * 用于完成说给的自动化任务
 *
 * 使用前需要本机装有谷歌浏览器 并将项目XXX文件夹下的XXX.exe文件放置在谷歌浏览器根目录下 方可使用
 */
@Component
public class DYNplmeans {

///////////////////////////////////////////////////爬虫自动化工具方法/////////////////////////////////////////////







    /**
     * 关闭当前页面方法
     * @param driver
     */
    public void closeWindow(WebDriver driver) {
        try {
            String winHandleBefore = driver.getWindowHandle();//关闭当前窗口前，获取当前窗口句柄
            Set<String> winHandles = driver.getWindowHandles();//使用set集合获取所有窗口句柄
            driver.close();//关闭窗口
            Iterator<String> it = winHandles.iterator();//创建迭代器，迭代winHandles里的句柄
            while (it.hasNext()) {//用it.hasNext()判断时候有下一个窗口,如果有就切换到下一个窗口
                String win = it.next();//获取集合中的元素
                if (!win.equals(winHandleBefore)) { //如果此窗口不是关闭前的窗口
                    driver.switchTo().window(win);//切换到新窗口
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





}
