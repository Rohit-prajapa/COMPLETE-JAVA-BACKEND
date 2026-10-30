import java.util.*;
public class FindLargestofThreeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter the 1st Number: ");
		a=sc.nextInt();
		
		int b;
		System.out.println("Enter the 2nd Number: ");
		b=sc.nextInt();
		
		int c;
		System.out.println("Enter the 3rd Number: ");
		c=sc.nextInt();
		
		if(a>b) {
			if(a>c) {
				System.out.println(a+" is Greater number: ");
			}
			else {
				System.out.println(c+" is Greater Number: ");
			}
		}
		else {
			if(b>c) {
				System.out.println(b+" is Gretare NUmber: ");
			}
			else {
				System.out.println(c+" is Greatre Number : ");
			}
		}
		
	}

}
