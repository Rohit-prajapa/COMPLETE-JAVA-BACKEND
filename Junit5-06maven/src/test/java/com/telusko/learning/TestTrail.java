package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTrail {

	@Test
	void test() {
		assertEquals(6,6);
	}
	
	@Test
	void testComputeArea() {
		Shape s=new Shape();
		assertEquals(78.5,s.computeCircleArea(5)); 
	}
}
