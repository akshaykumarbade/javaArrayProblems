package javaArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

//Java Program to Right rotate the array
// eg. [2,5,3,7,4,8] ==> [4,8,2,5,3,7] right rotated by 2 times.

public class RightRotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = {3,5,2,7,1,8};
		System.out.println(Arrays.toString(arr));
		
		System.out.println("How many times you wanna right rotate the above array?");
		int n = sc.nextInt();
		
		//first for loop to rotate n numbers
		for(int i=0;i<n;i++) {
			int last = arr[arr.length-1];
			int j;
			//second for loop for shifting the elements
			for(j=arr.length-1;j>0; j--) {
				//now shift the elements of array one by one
				arr[j] = arr[j-1];
			}
			
			//set first element to last
			arr[0]=last;
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
