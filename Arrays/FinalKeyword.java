// final ---- variable method(), as well as class can be final
// if variable is final we can not reassign it , if method is final we can not override it if class is final we can not inheritance it .. final means we can not change furthur....

import java.util.Scanner;

final class A {

  public void show() {
    System.out.println("In A show");
  }

  public void add(int a, int b) {
    System.out.println(a + b);
  }
}


public class FinalKeyword {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // final int a = 5;
    // System.out.println(a);

    A obj = new A();
    obj.show();
    obj.add(2, 3);
  }
}
