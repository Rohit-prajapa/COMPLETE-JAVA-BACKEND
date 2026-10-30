import java.util.Scanner;

class Calc {
  public int add(int n1, int n2) {
    return n1 + n2;
  }

  public int sub(int n1, int n2) {
    return n1 - n2;
  }
}

class SuperCalc extends Calc {
  public int mul(int n1, int n2) {
    return n1 * n2;
  }

  public int div(int n1, int n2) {
    return n1 / n2;
  }
}
public class inheritance {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    SuperCalc sup = new SuperCalc();
    int result = sup.add(3, 5);
    System.out.println(result);
    System.out.println(sup.sub(9, 8));
    System.out.println(sup.mul(3, 4));
    System.out.println(sup.div(5,4));
  }
}
