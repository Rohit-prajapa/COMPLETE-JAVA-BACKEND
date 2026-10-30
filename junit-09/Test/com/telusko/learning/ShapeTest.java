package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapeTest {

	@Test
	void area_Reactangle() {
		Shape s=new Shape();
		double actual=s.area(4, 6);
		double expected=24.0;
		
		assertEquals(expected,actual);
	}
	
	@Test
	void area_square() {
		Shape s=new Shape();
		int a=s.area(5);
		int b=25;
		
		assertEquals(b,a);
	}

}
