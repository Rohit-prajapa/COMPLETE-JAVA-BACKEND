import java.util.Scanner;

public class prectics1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n;
      System.out.println("Enter the Number Of Element");
      n = sc.nextInt();

      int[] arr = new int[4];
      System.out.println("Enter " + n + " element ");

      for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
      }

      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
      }
    }
}
