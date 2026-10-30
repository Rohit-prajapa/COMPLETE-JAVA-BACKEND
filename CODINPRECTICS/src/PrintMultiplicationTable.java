import java.util.*;
public class PrintMultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the Number: ");
		n=sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.print(n*i+" ");
		}

	}

}
