import java.util.*;
public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter the 1st Number: ");
		a=sc.nextInt();
		
		int b;
		System.out.println("Enter the 2nd number: ");
		b=sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a+" "+b);

	}

}
