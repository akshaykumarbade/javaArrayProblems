package javaArrayProblems;

import java.util.Arrays;

// Find smallest element in given array

public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,2,22,3,9,5};
		System.out.println("Given Array: "+ Arrays.toString(arr));
		int smallestElement = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<smallestElement) {
				smallestElement = arr[i];
			}
		}
		System.out.println("Smallest element in above array: "+smallestElement);

	}

}
