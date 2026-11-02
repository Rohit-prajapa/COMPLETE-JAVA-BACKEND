package com.telusko.learning;
public class ReverseString{
	public String reverseString(String str) {
		char[] arr=str.toCharArray();
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=(char) temp;
		}
		
	}
}