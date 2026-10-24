
import java.util.Scanner;

class A {
  public void show() {
    System.out.println("In A Show");
  }
}
public class Prectics10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    A obj = new B() {
       public void show() {
       System.out.println("In B Show");
         }
    };
    obj.show();
  }
}
