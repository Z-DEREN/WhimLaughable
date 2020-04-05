package com.zdr.whim_laughable.Main.Vo;

public class Upersonnel {

	// 用户id
	private Integer UID;
	// 用户名
	private String UName;
	// 用户密码
	private String UPass;
	// 用户MD5DI
	private String UMD5;
	// 用户权限
	private String UTYPE;
	// 用户邮箱
	private String UDmail;
	// 验证登录状态
	private String Ucondition;

	
	
	public String getUMD5() {
		return UMD5;
	}
	public void setUMD5(String UMD5) {
		this.UMD5 = UMD5;
	}
	public String getUPass() {
		return UPass;
	}
	public void setUPass(String UPass) {
		this.UPass = UPass;
	}
	public String getUcondition() {
		return Ucondition;
	}

	public void setUcondition(String Ucondition) {
		this.Ucondition = Ucondition;
	}

	public Integer getUID() {
		return UID;
	}

	public void setUID(Integer UID) {
		this.UID = UID;
	}

	public String getUName() {
		return UName;
	}

	public void setUName(String UName) {
		this.UName = UName;
	}

	public String getUTYPE() {
		return UTYPE;
	}

	public void setUTYPE(String UTYPE) {
		this.UTYPE = UTYPE;
	}

	public String getUDmail() {
		return UDmail;
	}

	public void setUDmail(String UDmail) {
		this.UDmail = UDmail;
	}

}
