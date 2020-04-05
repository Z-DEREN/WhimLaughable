package com.zdr.whim_laughable.Tool.conversion;

import java.security.MessageDigest;

/**
 * @author ZDR
 * @version 创建时间：2018-3-20 下午2:40:13
 * @introduction
 */
public class ShaMD5 {

	
	public  String saltMD5(String password) {
		ShaMD5 encoderSha = new ShaMD5(null, "SHA");// 先加盐
		password = encoderSha.encode(password);
		// System.out.println(password);
		return password;// 再加值,返回加密后值
	}
	
	public  String saltMD5(String password,String salt) {
		ShaMD5 encoderSha = new ShaMD5(salt, "SHA");// 先加盐
		password = encoderSha.encode(password);
		// System.out.println(password);
		return password;// 再加值,返回加密后值
	}

	private final static String[] hexDigits = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d",
			"e", "f" };

	private Object salt;
	private String algorithm;

	public ShaMD5() {
	}

	public ShaMD5(Object salt, String algorithm) {
		this.salt = salt;
		this.algorithm = algorithm;
	}

	public String encode(String rawPass) {
		String result = null;
		try {
			MessageDigest md = MessageDigest.getInstance(algorithm);
			// 加密后的字符串
			result = byteArrayToHexString(md.digest(mergePasswordAndSalt(rawPass).getBytes("utf-8")));
		} catch (Exception ex) {
		}
		return result;
	}

	public boolean isPasswordValid(String encPass, String rawPass) {
		String pass1 = "" + encPass;
		String pass2 = encode(rawPass);
		return pass1.equals(pass2);
	}

	private String mergePasswordAndSalt(String password) {
		if (password == null) {
			password = "";
		}

		if ((salt == null) || "".equals(salt)) {
			return password;
		} else {
			return password + "{" + salt.toString() + "}";
		}
	}

	/**
	 * 转换字节数组为16进制字串
	 * 
	 * @param b 字节数组
	 * @return 16进制字串
	 */
	private static String byteArrayToHexString(byte[] b) {
		StringBuffer resultSb = new StringBuffer();
		for (int i = 0; i < b.length; i++) {
			resultSb.append(byteToHexString(b[i]));
		}
		return resultSb.toString();
	}

	private static String byteToHexString(byte b) {
		int n = b;
		if (n < 0)
			n = 256 + n;
		int d1 = n / 16;
		int d2 = n % 16;
		return hexDigits[d1] + hexDigits[d2];
	}

	public static void main(String[] args) {
		ShaMD5 pe = new ShaMD5();
		String MD5 = pe.saltMD5("helloworld");
		System.out.println(MD5);
		
		
		// 加盐MD5加密
		String yan = "1";// 盐值
		String password = "helloworld";// 加密值
		ShaMD5 encoderSha =  new ShaMD5(yan, "SHA");// 先加盐
		String pass2 = encoderSha.encode(password);// 后加加密值
		
		System.out.println(pass2);
	}

}