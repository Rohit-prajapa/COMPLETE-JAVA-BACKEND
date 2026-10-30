import java.util.*;
public class SINGLENUMBER {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the number: ");
		n=sc.nextInt();
		
		int[] arr=new int[n];
		System.out.println("Enter the number Of Element: ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		int xor=0;
		for(int i=0; i<n; i++) {
			xor^=arr[i];
			
		}
		System.out.println("Single Number is :"+xor);
	}

}
