import java.util.*;
public class FactorialofaNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the Number: ");
		n=sc.nextInt();
		
		int fact=1;
		for(int i=1; i<=n; i++) {
			fact=fact*i;
		}
		System.out.println("The Factorial of the Given Number is");
	}

}
