package com.telusko.learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseString1Test {

	@Test
	public void test() {
		ReverseString1 str=new ReverseString1();
		String str1=str.ReverseString("java");
		String str2="avaj";
		assertEquals(str2,str1);
	}

}
