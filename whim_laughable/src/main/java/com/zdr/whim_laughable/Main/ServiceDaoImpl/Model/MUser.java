package com.zdr.whim_laughable.Main.ServiceDaoImpl.Model;

/**
 * 用户数据
 */
public class MUser {

private String udi ;
private String NAME;
private String dmail;
private String phone;
private String username;
private String puzzlekey;
private String userimg;

    public MUser(String udi, String NAME, String dmail, String phone, String username, String puzzlekey, String userimg) {
        this.udi = udi;
        this.NAME = NAME;
        this.dmail = dmail;
        this.phone = phone;
        this.username = username;
        this.puzzlekey = puzzlekey;
        this.userimg = userimg;
    }

    public MUser() {
    }


    public String getUdi() {
        return udi;
    }

    public void setUdi(String udi) {
        this.udi = udi;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getDmail() {
        return dmail;
    }

    public void setDmail(String dmail) {
        this.dmail = dmail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPuzzlekey() {
        return puzzlekey;
    }

    public void setPuzzlekey(String puzzlekey) {
        this.puzzlekey = puzzlekey;
    }

    public String getUserimg() {
        return userimg;
    }

    public void setUserimg(String userimg) {
        this.userimg = userimg;
    }
}
