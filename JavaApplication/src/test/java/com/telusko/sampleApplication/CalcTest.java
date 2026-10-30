package com.telusko.sampleApplication;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalcTest {
	@Test
	void testCalc() {
		Calc calc=new Calc();
		int actualresult=calc.divide(5, 5);
		int acceptedResult=1;
		assertEquals(acceptedResult,actualresult);
	}
} 
