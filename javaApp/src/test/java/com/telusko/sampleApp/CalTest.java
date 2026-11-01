package com.telusko.sampleApp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalTest {
	
	@Test
	void testCal() {
		Cal c=new Cal();
		int actualResult=c.divide(10, 5);
		int expectedResult=2;
		
		assertEquals(expectedResult,actualResult);
		
	}
}
