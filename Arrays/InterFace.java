//   class-class=====extands
// class-interface=======implements
// interface-interface=======extends


import java.util.Scanner;
interface A {
  void show();
  void config();
}

class B implements A {
  public void show() {
    System.out.println("In show");
  }

  public void config() {
    System.out.println("In config");
  }
}

public class InterFace {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    A obj = new B();
    obj.show();
    obj.config();
  }
}
