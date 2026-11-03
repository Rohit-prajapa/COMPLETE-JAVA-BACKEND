package ABC;

abstract class Shape {
	int lenth;
	int breadth;
	int radius;
	
	abstract void printArea();
	
	class Rectangle extends Shape
	{
		Rectangle(int length, int breadth)
		this.length=length;
		this.breadth= breadth;
		
	}
void printArea();
int area=length*breadth;
System.out.println("Area of Rectangle:" +area);
}
}
class Triangle extends Shape
{
	Triangle(int length, int breadth);
	this.length=length;
	this.breadth= breadth;
}
void printArea();
int area=0.5*length*breadth;
}

class Circle extends Shape
{ 
	circle(int radius)
	this.radius=radius;
}
void printArea(); 
int area=3.14*radius*radius;
 system.out.println("the area of the circle is:" +area);
 
}