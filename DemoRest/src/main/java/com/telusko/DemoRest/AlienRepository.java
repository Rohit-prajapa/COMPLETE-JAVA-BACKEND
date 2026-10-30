package com.telusko.DemoRest;

import java.util.ArrayList;
import java.util.List;

public class AlienRepository {
	List<Alien> list;
	
	public AlienRepository(){
		list=new ArrayList<>();
		Alien a1=new Alien();
		a1.setName("Rohit");
		a1.setPoints(50);
		
		Alien a2=new Alien();
		a2.setName("Ankit");
		a2.setPoints(30);
		
		Alien a3=new Alien();
		a3.setName("Rahul");
		a3.setPoints(45);
		
		list.add(a1);
		list.add(a2);
		list.add(a3);
	}
	
}
