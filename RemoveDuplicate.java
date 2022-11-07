package javaArrayProblems;

import java.util.Arrays;
import java.util.HashSet;

// Remove duplicate elements from given array

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,2,6,2,4,3,8,6,7};
		System.out.println("Original Array: "+Arrays.toString(arr));
		
		
		//first and fast approach using Hashset
//		HashSet<Integer> result = new HashSet<Integer>();
//		
//		for (Integer integer : arr) {
//			result.add(integer);
//		}
//		
//		System.out.print(result);
		
		
		// Second approach by sorting array and then comparing two consecutive elements;
		int temp;
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		
		int[] tempArr = new int[arr.length]; // we'll use tempArr to store unique values
		int j=0; // for indicating index of tempArr
		for(int i=0; i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) { // comparing two consecutive values in arr
				tempArr[j]=arr[i]; // if not same then adding value at ith index to jth index in tempArr
				j++; // increment jth index by one for next value
			}
		}
		tempArr[j]=arr[arr.length-1]; // it will add the last index value in arr to tempArr
		j++;
		
		System.out.print("Array after removing duplicate values: ");
		for(int i=0; i<j; i++) {
			System.out.print(tempArr[i]+" ");
		}
	}
}
