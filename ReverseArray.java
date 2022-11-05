package javaArrayProblems;

import java.util.Arrays;

// Program to reverse the arry or print the reverse array

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {4,2,7,3,9,5};
		System.out.println("Original Array: "+Arrays.toString(arr));
		
		// 1. Using temporary array
		int[] temp = new int[arr.length]; //temp array to store the reverse order.
		int i=0;
		for(int j= arr.length-1; j>=0; j--) {
			temp[i]= arr[j];
			i++;
			
		}
		
		System.out.println("Reversed Array by using temp arr: "+ Arrays.toString(temp));
		
		//2. By swapping 
		
		int t;
		for(int k=0; k<(arr.length)/2;k++) {
			t= arr[k]; // 4
			arr[k]=arr[arr.length-1 -k];// 6-1-0=5 i.e arr[0]=arr[5]
			arr[arr.length-1-k]=t;// arr[5]=4;
		}
		
		System.out.println("Reversed Array by swapping: "+Arrays.toString(arr));
	}

}
