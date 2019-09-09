package com.lsh.test;

import org.junit.Test;

import com.lsh.bean.BeanUtil;

public class TestUtils {
	
	@Test
	public void test01() {
		String changeTest = BeanUtil.changeTest("年好恼火\r\n发货的随访\r");
		System.out.println(changeTest);
	}
}
