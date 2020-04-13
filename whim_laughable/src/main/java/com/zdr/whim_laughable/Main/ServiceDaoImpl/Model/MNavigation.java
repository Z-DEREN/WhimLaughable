package com.zdr.whim_laughable.Main.ServiceDaoImpl.Model;


/**
 * 导航栏
 */
public class MNavigation {
    //排序
    private int ranking ;
    //地址
    private String url;
    //名称
    private String label;
    //图标
    private String icons;


    public MNavigation(int ranking, String url, String label, String icons) {
        this.ranking = ranking;
        this.url = url;
        this.label = label;
        this.icons = icons;
    }

    public MNavigation() {
    }


    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getIcons() {
        return icons;
    }

    public void setIcons(String icons) {
        this.icons = icons;
    }
}
