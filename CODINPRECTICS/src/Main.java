import java.util.*;
class Animal{
	 String name;
	
	public Animal(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
}
 class Dog extends Animal{
	public Dog( String name) {
		super(name);
	}
	
	public void bark() {
		System.out.println(name+" is barking");
	}
	
	
}
public class Main {

	public static void main(String[] args) {
		Dog d=new Dog("sheru");
		d.bark();

	}

}
