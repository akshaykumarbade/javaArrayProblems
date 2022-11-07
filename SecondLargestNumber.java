package javaArrayProblems;

import java.util.Arrays;

// find the second largest element/ number in an array

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {4,2,22,3,9,5};
		System.out.println("Given Array: "+ Arrays.toString(arr));
		
		int temp;
		//make array in descending order and then second element will be second largest.
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
		}
		System.out.println("Second Largest Number in given array: "+ arr[1]);
		System.out.println("Third Largest Number in given array: "+ arr[2]);
		System.out.println("Second Smallest number in given array: "+ arr[arr.length-1-1]);

	}

}
