import java.util.Scanner;

class Human {
  private int age;
  private String name="Rohit";

  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

}
public class Prectics5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Human h = new Human();
    System.out.println(h.getName());
    System.out.println(h.getAge());
    h.setAge(30);
    h.setName("Prajapati");
    System.out.println(h.getAge());
    System.out.println(h.getName());

  }
}
