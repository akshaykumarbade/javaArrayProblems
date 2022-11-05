package javaArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

// Java Program to left rotate the given array.
// e.g input = { 1,2,3,4,5} output ={2,3,4,5,1}

public class LeftRotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = {3,5,2,7,1,8};
		System.out.println(Arrays.toString(arr));
		
		System.out.println("How many times you wanna left rotate the above array?");
		int n = sc.nextInt();
		
		//first for loop to left rotate array n number of times
		for(int i=0; i<n;i++) {
			int first=arr[0];
			int j;
			//to shift the elements of array to the left by one position
			for( j=0; j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[j]=first;
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		sc.close();

	}

}
