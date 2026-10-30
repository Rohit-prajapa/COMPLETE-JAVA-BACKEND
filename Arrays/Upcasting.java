import java.util.Scanner;
class A {
  public void show1() {
    System.out.println("In A Show");
  }
}
class B extends  A{
  public void show2(){
    System.out.println("In B Show");
  }
}

public class Upcasting {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    B obj = new B();
    obj.show1();
    obj.show2();
  }
}
