package com.lsh.test;

import org.junit.Test;

import com.lsh.bean.StringUtil;



public class TestUtil {
	
	@Test
	public void test01() {
		boolean phone = StringUtil.isPhone("14512301254");
		System.out.println(phone);
	}
	
	@Test
	public void test02() {
		boolean email = StringUtil.isEmail("1048467012@qq.com");
		System.out.println(email);
	}
	
	@Test
	public void test03() {
		boolean empty = StringUtil.isEmpty("");
		System.out.println(empty);
	}
}
