import java.util.Scanner;

class A {
  public void show() {
    System.out.println("In A Show");
  }
}
class B extends A {
  public void show() {
    System.out.println("In B show");
  }
}
class c extends A {
  public void show() {
    System.out.println("In c Show");
  }
}

public class polymorphism{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    A obj = new B();
    obj.show();

    obj = new c();
    obj.show();

  }
}
