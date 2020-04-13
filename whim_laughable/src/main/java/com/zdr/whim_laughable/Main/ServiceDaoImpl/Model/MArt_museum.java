package com.zdr.whim_laughable.Main.ServiceDaoImpl.Model;

import javax.xml.crypto.Data;

/**
 * 博客数据
 */
public class MArt_museum {

    private int id;
    private int textid;
    private String TYPE;
    private String label1;
    private String label2;
    private String label3;
    private String label4;
    private String textartwork;
    private int state;
    private Data updatetime;
    private Data DATETIME;
    private int authorid;


    public MArt_museum(int id, int textid, String TYPE, String label1, String label2, String label3, String label4, String textartwork, int state, Data updatetime, Data DATETIME, int authorid) {
        this.id = id;
        this.textid = textid;
        this.TYPE = TYPE;
        this.label1 = label1;
        this.label2 = label2;
        this.label3 = label3;
        this.label4 = label4;
        this.textartwork = textartwork;
        this.state = state;
        this.updatetime = updatetime;
        this.DATETIME = DATETIME;
        this.authorid = authorid;
    }

    public MArt_museum() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTextid() {
        return textid;
    }

    public void setTextid(int textid) {
        this.textid = textid;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public String getLabel1() {
        return label1;
    }

    public void setLabel1(String label1) {
        this.label1 = label1;
    }

    public String getLabel2() {
        return label2;
    }

    public void setLabel2(String label2) {
        this.label2 = label2;
    }

    public String getLabel3() {
        return label3;
    }

    public void setLabel3(String label3) {
        this.label3 = label3;
    }

    public String getLabel4() {
        return label4;
    }

    public void setLabel4(String label4) {
        this.label4 = label4;
    }

    public String getTextartwork() {
        return textartwork;
    }

    public void setTextartwork(String textartwork) {
        this.textartwork = textartwork;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Data getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Data updatetime) {
        this.updatetime = updatetime;
    }

    public Data getDATETIME() {
        return DATETIME;
    }

    public void setDATETIME(Data DATETIME) {
        this.DATETIME = DATETIME;
    }

    public int getAuthorid() {
        return authorid;
    }

    public void setAuthorid(int authorid) {
        this.authorid = authorid;
    }
}
