package com.zdr.whim_laughable.Main.SuperFactory;

import com.zdr.ahairteeter.demo.Main.ThreadExecutionMethod.Warehouse.WarehouseImpl;

//工厂类
public class Factory {

    //用于简化爬虫与多线程工厂实例化方法
    public static WarehouseImpl GetThreadService(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //根据用户选择名字读取指定模块
        WarehouseImpl WarehouseImpl ;
        String classfileName = "com.zdr.ahairteeter.demo.Main.ThreadExecutionMethod.Warehouse."+className;
        Class cla = Class.forName(classfileName);
        Object obj = cla.newInstance();
        return (WarehouseImpl)obj;
    }


}
