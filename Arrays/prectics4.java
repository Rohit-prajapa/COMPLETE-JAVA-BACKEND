import java.util.Scanner;
public class prectics4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // String str = " Rohit ";
    // str = str + " Prajapati ";
    // System.out.println(str);

    StringBuffer sb = new StringBuffer("Rohit ");
    // System.out.println(sb.capacity());
    sb.append(" Prajapati ");
    System.out.println(sb);

    System.out.println(sb.charAt(4));
    sb.insert(5, " Java");
    System.out.println(sb);

  }
}
