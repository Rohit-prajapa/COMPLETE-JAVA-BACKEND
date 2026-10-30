import java.util.*;
public class FirstNBinaryNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the Number: ");
		n=sc.nextInt();
		
		Queue<String> q=new LinkedList<>();
		q.add("1");
		
		for(int i=0; i<n; i++) {
			String curr=q.remove();
			
			System.out.println(curr+" ");
			
			q.add(curr+" 0");
			q.add(curr+" 1");
		}

	}

}
