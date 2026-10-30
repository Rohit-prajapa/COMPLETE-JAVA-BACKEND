import java.util.Scanner;
class A extends Thread{
  public void run(){
      for(int i=1; i<=10; i++){
        System.out.println("Hii");
        try {
          Thread.sleep(10);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }
class B extends Thread{
    public void run(){
      for(int i=1; i<=10; i++){
        System.out.println("Hello ");
        try {
          Thread.sleep(10);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }
public class prectics1{

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      A obj1=new A();
      B obj2=new B();
      obj1.start();
      obj2.start();
  }
}
