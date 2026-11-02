
import java.util.Objects;
import java.util.Scanner;

class laptop {
  String model;
  int price;

  public String toString() {
    return model + " : " + price;
  }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.model);
        hash = 59 * hash + this.price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final laptop other = (laptop) obj;
        if (this.price != other.price) {
            return false;
        }
        return Objects.equals(this.model, other.model);
    }

}

public class ObjectClass {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    laptop obj = new laptop();
    obj.model = "Dell";
    obj.price = 10000;
    System.out.println(obj);
    // here obj internall call the toString method which represent the className@hashcode


}
}
