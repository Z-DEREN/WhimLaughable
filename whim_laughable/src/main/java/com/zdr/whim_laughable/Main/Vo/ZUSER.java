package com.zdr.whim_laughable.Main.Vo;

public class ZUSER {

	// 用户id
	private Integer ZDI;
	// 用户名
	private String NAME;
	// 用户密码
	private String Pass;
	// 用户MD5DI
	private String ZMD5;
	// 用户权限
	private String TYPE;
	// 用户邮箱
	private String Dmail;
	// 验证登录状态
	private String condition;

	
	
	public String getZMD5() {
		return ZMD5;
	}
	public void setZMD5(String zMD5) {
		ZMD5 = zMD5;
	}
	public String getPass() {
		return Pass;
	}
	public void setPass(String pass) {
		Pass = pass;
	}
	public String getD7788b7e0ba4b6e3aa57b35bbf93dfc6() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Integer getZDI() {
		return ZDI;
	}

	public void setZDI(Integer zDI) {
		ZDI = zDI;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getTYPE() {
		return TYPE;
	}

	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}

	public String getDmail() {
		return Dmail;
	}

	public void setDmail(String dmail) {
		Dmail = dmail;
	}

}
