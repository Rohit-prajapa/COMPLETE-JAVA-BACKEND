
import java.util.Scanner;

abstract class  Car {
  public abstract void drive();

  public void playMusic() {
    System.out.println("You can Play Music ");
  }
}

class WagnoR extends Car {
  public void drive() {
    System.out.println("Driving the Car");
  }
}
public class AbstractKeyword {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Car c = new Car();  we can not create the object the abstract class

    WagnoR obj = new WagnoR();
    obj.drive();
    obj.playMusic();
  }
}
