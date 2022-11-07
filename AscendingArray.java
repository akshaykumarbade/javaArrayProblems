package javaArrayProblems;

import java.util.Arrays;

// Sort elements of an array in ascending order.

public class AscendingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {4,2,22,3,9,5};
		System.out.println("Given Array: "+ Arrays.toString(arr));
		
		int temp;//for swapping the elements
		//itarate the array twice with i and j
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length;j++) {
				//compare the values at ith index and j=i+1 th index 
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Array in Ascending order: "+Arrays.toString(arr));

	}

}
