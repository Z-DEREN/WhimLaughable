package com.zdr.whim_laughable.Main.ServiceDaoImpl.ServiceImpl;

import com.zdr.whim_laughable.Main.ServiceDaoImpl.Mapper.INavigation;
import com.zdr.whim_laughable.Main.ServiceDaoImpl.Model.MArt_museum;
import com.zdr.whim_laughable.Main.ServiceDaoImpl.Model.MNavigation;
import com.zdr.whim_laughable.Main.ServiceDaoImpl.Model.MUser;
import com.zdr.whim_laughable.Main.ServiceDaoImpl.Service.SNavigation;
import com.zdr.whim_laughable.Main.ServiceDaoImpl.Mapper.INavigation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MINavigation implements SNavigation {
    @Autowired
    INavigation INavigation;
    /*
    获取导航栏数据
     */
    @Override
    public List<Map<String, Object>> navigation() {
        List<Map<String, Object>> returnmap = new ArrayList<Map<String, Object>>();
        List<MNavigation> navigation = INavigation.navigation();
        for (MNavigation nav : navigation) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("table", nav.getLabel());
            map.put("tvalue", nav.getUrl());
            map.put("icons", nav.getIcons());
            returnmap.add((nav.getRanking() - 1), map);
        }
        return returnmap;
    }

    /**
     *
     * @param MUser
     * @return
     */
    @Override
    public MUser visituserdata(MUser MUser) {
        MUser newMUser = new MUser();
        newMUser = INavigation.visituserdata(MUser);
        return newMUser;
    }

    @Override
    public int visituserdata(MArt_museum mart_museum) {
        int rut = INavigation.INSERTart_museum(mart_museum);
        return rut;
    }


}
