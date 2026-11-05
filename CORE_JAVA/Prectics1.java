import java.util.Scanner;
public class Prectics1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 1;
    while (i<=5) {
      System.out.println("Hello " + i);
      int j = 1;
      while (j<=3) {
        System.out.println("Rohit " + j);
        j++;
      }
      i++;
    }
  }
}
