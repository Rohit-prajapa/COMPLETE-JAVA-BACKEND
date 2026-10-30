package BASICJAVA;
import java.util.*;
public class evenodd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the number");
		n=sc.nextInt();
		
		if(n%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("odd Number");
		}
	}

}
