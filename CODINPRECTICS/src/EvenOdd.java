import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the Number: ");
		n=sc.nextInt();
		
		if(n%2==0) {
			System.out.println(n+" is Even Number: ");
		}
		else {
			System.out.println(n+" is Odd Number: ");
		}
	}

}
