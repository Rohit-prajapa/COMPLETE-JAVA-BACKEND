import java.util.Scanner;

enum Laptop {
  Window(2000), macbook(50000), Dell(60000);

  private int price;

  private Laptop(int price) {
    this.price = price;
  }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
public class Prectics14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Laptop obj = Laptop.Window;
    // System.out.println(obj.ordinal());

    Laptop lap = Laptop.macbook;
    System.out.println(lap+" "+lap.getPrice()); 

  }
}
