import java.util.*;
public class AddTwoNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Integer a=128;
		Integer b=128;
		
		System.out.println(a==b);
		
		String str="java";
		String str1=new String("java");
		System.out.println(str==str1);
		
		
		try {
			double a1=10.0/0;
			System.out.println("hii");
		} finally {
			System.out.println("rohit"+"Prajapati");
		}
		
		int n;
		System.out.println("enter the number : ");
		n=sc.nextInt();
		
		
		
		int sum=0;
		for(int i=1; i<=n; i++) {
			System.out.println("enter the Number :"+i+" ");
			int num=sc.nextInt();
			sum=sum+num;
		}
		
		double avg=(double) (sum/n);
		System.out.println("average is :"+avg);
		
        for(int i=1; i<=n; i++) {
			if(i*i==n) {
				System.out.println("Square root is :"+i);
				break;
			}
		}
			
	}

}
