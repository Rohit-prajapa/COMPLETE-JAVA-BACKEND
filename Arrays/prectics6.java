import java.util.Scanner;

class Human {
  private int age;
  private String name;

  public int getage() {
    return age;
  }

  public void setage(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
public class prectics6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Human h = new Human();
    h.setName("Rohit");
    h.setage(30);
    System.out.println(h.getage());
    System.out.println(h.getName());
  }
}
