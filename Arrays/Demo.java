
@FunctionalInterface
interface  A {
   void show();
}

// class B implements A {
//   public void show() {
//     System.out.println("In B Show");
//   }
// }

public class Demo {
  public static void main(String[] args) {
    A obj =()-> System.out.println("In show B");
    obj.show();

  }
}
