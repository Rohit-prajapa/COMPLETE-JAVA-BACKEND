package com.telusko.learning;

public class ReverseString {
	public String ReverseStr(String str) {
		char[] arr=str.toCharArray();
		int left=0;
		int right=str.length()-1;
		while(left<right) {
			char temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
			
		}
		return new String(arr);
	}
}
