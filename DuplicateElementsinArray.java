package javaArrayProblems;

// Program to print the elements of an array.

public class DuplicateElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,4,2,6,2,4,3,8,6,7};
		
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]== arr[j]) {
					System.out.print(arr[i]+" ");
				}
			}
		}

	}

}
