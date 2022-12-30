package javaArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

// take the size of array on command line and fill the numbers in it.

public class FillTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter the number to fill in the array: ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		sc.close();
	}

}
