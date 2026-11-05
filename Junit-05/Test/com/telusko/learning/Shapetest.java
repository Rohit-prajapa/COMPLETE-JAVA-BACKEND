package com.telusko.learning;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.geom.Area;

class Shapetest {

    @Test
    void test() {
    	Shape area=new Shape();
   
   double actual= area.computeSquareArea(5);
   double expected=25;
   
   
    assertEquals(expected,actual);
    }
    
    @Test
    void testComputeCircleArea() {
    	
    	Shape area=new Shape();
    	assertEquals(78.5,area.computeCircleArea(5));
    }
}