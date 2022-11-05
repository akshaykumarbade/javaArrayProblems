package javaArrayProblems;

import java.util.Arrays;

//Find the largest element in given array

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,2,22,3,9,5};
		System.out.println("Given Array: "+ Arrays.toString(arr));

		int max = arr[0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		System.out.println("Largest element in above array: "+max);

	}

}
