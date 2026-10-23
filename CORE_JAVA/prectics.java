
import java.util.Scanner;

public class prectics {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a;
    System.out.println("enter the 1st Number");
    a = sc.nextInt();

    int b;
    System.out.println("Enter the 2nd Number");
    b = sc.nextInt();

    boolean result = a > b;
    System.out.println(result);
  }
}
