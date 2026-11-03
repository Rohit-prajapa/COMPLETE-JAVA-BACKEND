import java.util.Scanner;

class A { // every class in java extends from object class
  public A() {
    super();
    System.out.println("In A");
  }

  public A(int n) {
    super();
    System.out.println("In A int");
  }
}

class B extends A {
  public B() {
    super();
    System.out.println("In B");
  }

  public B(int n) {
    // super();
    this(); // this as a methos excute the constructor of the same class 
    System.out.println("In B Int");
  }
}
public class ThisAndSuper {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     B obj = new B(5);
  }
}
