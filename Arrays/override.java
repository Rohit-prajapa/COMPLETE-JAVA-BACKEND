import java.util.Scanner;

class A {
  public void show() {
    System.out.println("In show");
  }
}
public class override {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      A obj = new A();
      obj.show();
  }
}
