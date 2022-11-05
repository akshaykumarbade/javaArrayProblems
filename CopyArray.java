package javaArrayProblems;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,6,4,8,5,9,7};
		
		int[] result = new int[arr.length];
		
		for(int i=0; i<arr.length;i++) {
			result[i]=arr[i];
			System.out.print(result[i]+" ");
		}
		
		

	}

}
