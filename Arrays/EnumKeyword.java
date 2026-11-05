import java.util.Scanner;
enum status {
  Running, failed, success;
}
public class EnumKeyword {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // status s = status.Running;
    // System.out.println(s.ordinal());

    status[] s = status.values();
    for (status t : s) {
      System.out.println(t+" "+t.ordinal());
    }
  }
}
