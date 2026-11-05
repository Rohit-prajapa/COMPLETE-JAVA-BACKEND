import java.util.*;
public class GCD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter the 1st Number: ");
		a=sc.nextInt();
		
		int b;
		System.out.println("Enter the 2nd Number : ");
		b=sc.nextInt();
		
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
		}
		
		System.out.println("GCD OF TWO NUMBER IS :"+a);
	}

}
