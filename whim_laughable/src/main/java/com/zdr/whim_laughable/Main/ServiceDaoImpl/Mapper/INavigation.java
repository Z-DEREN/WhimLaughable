package com.zdr.whim_laughable.Main.ServiceDaoImpl.Mapper;

import com.zdr.whim_laughable.Main.ServiceDaoImpl.Model.MNavigation;
import com.zdr.whim_laughable.Main.ServiceDaoImpl.Model.MUser;
import com.zdr.whim_laughable.Main.ServiceDaoImpl.Model.MArt_museum;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface INavigation {

    /*
     * 返回导航栏数据
     * */
    @Select(" SELECT ranking , url , label , icons FROM  navigation WHERE state = 1 ORDER BY ranking")
    List<MNavigation> navigation();

    /*
     * 当前用户数据
     * */
    @Select("  SELECT udi , NAME  , userimg , dmail , phone , username FROM users WHERE udi = 100001 OR username = #{username} OR phone = #{phone} OR dmail = #{dmail} AND puzzlekey = #{puzzlekey}  ;")
    MUser visituserdata(MUser MUser);

    /**
     * 博客入库
     * @param mart_museum
     * @return
     */
    @Select("INSERT INTO whim_laughable.art_museum (id, textid, TYPE, label1, label2, label3, label4, textartwork, state, updatetime, DATETIME, authorid) VALUES " +
            " ('id', 'textid', 'type', 'label1', 'label2', 'label3', 'label4', 'textartwork', 'state', 'updatetime', 'datetime', 'authorid'); ")
    int INSERTart_museum(MArt_museum mart_museum);






}
