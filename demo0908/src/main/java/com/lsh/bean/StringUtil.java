package com.lsh.bean;

public class StringUtil {
	
	private StringUtil() {}
	
	public static boolean isPhone(String phone) {
		if(isEmpty(phone)) {
			return false;
		}
		String reg_phone = "^1[2345]\\d{9}$";
		boolean matches = phone.matches(reg_phone);
		return matches;
	}
	
	public static boolean isEmail(String email) {
		if(isEmpty(email)) {
			return false;
		}
		String reg_email = "^\\w+[@]\\w+[.](com|cn|net)$";
		boolean matches = email.matches(reg_email);
		return matches;
	}
	
	public static boolean isEmpty(String str) {
		return str!=null && !"".equals(str.trim());
	}
	
	
	
}
