package javaArrayProblems;

import java.util.Arrays;

// How to print even position(not index) and odd position elements of an array

public class EvenAndOddPositionElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,2,7,3,9,5};
		System.out.println("Given Array:"+Arrays.toString(arr));
		System.out.print("Elements at even position: ");
		for(int i=1; i<arr.length;i=i+2) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		System.out.print("Elements at odd position: ");
		for(int i=0;i<arr.length;i=i+2) {
			System.out.print(arr[i]+" ");
		}

	}

}
