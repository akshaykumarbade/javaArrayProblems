package javaArrayProblems;

import java.util.Arrays;

// Find the sum of all elements in an array?

public class SumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,2,22,3,9,5};
		System.out.println("Given Array: "+ Arrays.toString(arr));
		int sum =0; 
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		
		System.out.println("Sum of all elements in above array: "+ sum);
		
	}

}
