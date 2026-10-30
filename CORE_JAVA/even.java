import java.util.Scanner;
public class even {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter the Number");
    n = sc.nextInt();
    // if (n % 2 == 0) {
    //   System.out.println("Even Number");
    // }
    // else {
    //   System.out.println("Odd Number");
    // }
    String result = (n % 2 == 0) ? "Even Number" : "Odd Number";
    System.out.println(result);
  }
}
