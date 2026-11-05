import java.util.Scanner;

class Computer {

  public void palyMusic() {
    System.out.println("Music is Playing");
  }

  public String getPen(int cost){
    return "Pen";
    }
}
public class Demo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Computer c = new Computer();
    c.palyMusic();
    String str = c.getPen(10);
   System.out.println(str);
  }
}
