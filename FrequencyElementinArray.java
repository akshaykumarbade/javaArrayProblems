package javaArrayProblems;


//Q find the frequency of each element in array.

public class FrequencyElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int[] arr = {2,6,2,4,9,6,2};
		int count;
		int visited =-1;
		int[] frequecny = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			count=1;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					frequecny[j]=visited;
				}
			}
			if(frequecny[i]!= visited) {
				frequecny[i]=count;
			}
		}
		
		for(int i = 0; i < frequecny.length; i++){  
            if(frequecny[i] != visited)  
                System.out.println("Frequency of  " + arr[i] + " : " + frequecny[i]);  
        } 

	}

}
