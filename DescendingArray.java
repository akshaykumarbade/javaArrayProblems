package javaArrayProblems;

import java.util.Arrays;

// Sort elements of array in descending order.

public class DescendingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {4,2,22,3,9,5};
		System.out.println("Given Array: "+ Arrays.toString(arr));
		
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
		}
		
		System.out.println("Array in Decending order"+ Arrays.toString(arr));

	}

}
