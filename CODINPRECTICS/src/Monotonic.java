
public class Monotonic {
	public static boolean isMonotonic(int[] arr) {
		boolean inc=true;
		boolean dec=true;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<arr[i-1]) {
				inc=false;
			}
			if(arr[i]>arr[i-1]) {
				dec=false;
			}
		}
		
		return inc || dec;

	}
	public static void main(String[] args) {
		int[] arr= {1,2,2,5};
		 System.out.println(isMonotonic(arr));
	}

}
