package javaArrayProblems;


public class NonRepeatingElementsofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,6,3,2,5,3,7,7};
		
		for(int i=0;i<arr.length;i++) {
			boolean flag = true; //creating a boolean with true 
			for(int j=0;j<arr.length;j++) {
				if(i!=j && arr[i]==arr[j]) {
					flag=false;// if elements of two distinct indices are equal ie. that element is repeating. so make flag false.
					break;
				}
			}
			if(flag) { // if flag remain true then print that element.
				System.out.print(arr[i]+" ");
			}
		}
	}

}
