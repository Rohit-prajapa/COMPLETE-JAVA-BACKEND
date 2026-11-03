
import java.util.Scanner;

class A {
  int age;

  public void show() {
    System.out.println("In show");
  }
  class B {
    public void config() {
      System.out.println("In config");
    }
  }
}
public class InnerClass {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    A obj = new A();
    obj.show();
    A.B obj1 = obj.new B();
    obj1.config();
  }
}
