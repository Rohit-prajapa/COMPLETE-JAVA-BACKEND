package com.telusko.DemoRest;

import java.util.Arrays;
import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("Alien")
public class AlienResource {
	
	@GET
	public List<Alien> getAlien() {
		
		System.out.println("Hello Alien");
		Alien a1=new Alien();
		
	
		List<Alien> list=Arrays.asList(a1,a2,a3);
		return list;
	}
}
