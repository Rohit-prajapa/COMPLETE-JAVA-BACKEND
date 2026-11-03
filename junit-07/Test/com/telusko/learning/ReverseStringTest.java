package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void test() {
		ReverseString str=new ReverseString();
		String str1=str.ReverseStr("java");
		String str2="avaj";
		
		assertEquals(str2,str1);
	}

}
