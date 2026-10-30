package com.example.demo;

public class Car {
	private Engine e;
	// construtor injection
	Car(Engine en){
		this.e=en;
	}
 public void drive() {
	 e.start();
	 System.out.println("car drivinng");
 }
}
