import java.util.Scanner;

public class prectics2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n;
    System.out.println("Enter the number of Row: ");
    n = sc.nextInt();

    int m;
    System.out.println("Enter the Number Of Column");
    m = sc.nextInt();

    int[][] arr = new int[n][m];

    System.out.println("Enter " + n * m + " Element");

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    System.out.println();

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

  }
}
