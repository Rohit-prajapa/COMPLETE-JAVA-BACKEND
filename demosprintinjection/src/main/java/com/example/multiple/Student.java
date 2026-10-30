package com.example.multiple;
import java.util.*;
public class Student {
	private String name;
	private List<Sport> s;
	public void setName(String name) {
		this.name=name;
	}
	public void setS(List<Sport> s) {
		this.s=s;
	}
	public void show() {
		System.out.println("sport deatils ");
		System.out.println("student name "+name);
		
		for(Sport s1:s) {
			s1.sport_deatils();
		}
	}
}
