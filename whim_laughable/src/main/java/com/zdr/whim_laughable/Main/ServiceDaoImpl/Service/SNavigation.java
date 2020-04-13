package com.zdr.whim_laughable.Main.ServiceDaoImpl.Service;

import com.zdr.whim_laughable.Main.ServiceDaoImpl.Model.MArt_museum;
import com.zdr.whim_laughable.Main.ServiceDaoImpl.Model.MNavigation;
import com.zdr.whim_laughable.Main.ServiceDaoImpl.Model.MUser;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

public interface SNavigation {



    /*
    * 返回导航栏数据
    * */
    @Transactional
    List<Map<String,Object>> navigation();

    /*
     * 返回用户数据
     * */
    @Transactional
    MUser visituserdata(MUser MUser);

    /*
     * 返回用户数据
     * */
    @Transactional
    int visituserdata(MArt_museum mart_museum);


}
