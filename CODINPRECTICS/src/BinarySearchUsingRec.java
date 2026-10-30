
public class BinarySearchUsingRec {
	public static int binarySearch(int[] arr, int low, int high, int target){
		
		if(low>high) return -1;
		
		int mid=low+(high-low)/2;
		
		if(arr[mid]==target) return mid;
		else if(arr[mid]<target) return  binarySearch(arr,mid+1,high,target);
		return binarySearch(arr,low,mid-1,target);
	}
	public static void main(String[] args) {
		int[] arr= {2,5,8,2};
		int n=8;
		int c=binarySearch(arr,0,arr.length-1,n);
		System.out.println(c);
	}

}
