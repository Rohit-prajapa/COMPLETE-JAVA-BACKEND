import java.util.*;
public class CheckLeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the Number: ");
		n=sc.nextInt();
		
		if(n%400==0 ||(n%4==0 && n%100!=0)) {
			System.out.println("it is Leap Year :");
		}
		else {
			System.out.println("it is not a Leap year: ");
		}

	}

}
