
import java.util.Scanner;

abstract class Car {
  public abstract void drive();

  public void playMusic() {
    System.out.println("You can Play Music ");
  }

}

class Swift extends Car {
  public void drive() {
    System.out.println("You can Drive the car");
  }
}
public class Prectics9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Swift obj = new Swift();
    obj.playMusic();
    obj.drive();

  }
}
