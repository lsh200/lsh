package com.lsh.bean;

public class BeanUtil {
	
	private BeanUtil() {}
	
	public static String changeTest(String str) {
		String str1 = "\\\\n\\\\r";
		String replace = str.replaceAll(str1, "<p></p>");
		String str2 = "\\\\r";
		String replace2 = replace.replaceAll(str2, "<br>");
		return replace2;
	}
}
