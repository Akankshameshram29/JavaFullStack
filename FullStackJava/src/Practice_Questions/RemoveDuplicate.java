package Practice_Questions;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int [] arr = {1,1,3,6,9,3,2,8};
		System.out.println("Array before removing duplicate elements");
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		
		Arrays.sort(arr);
	    int j =0;
	    for(int i=0;i<arr.length-1;i++) {
	    	if(arr[i] != arr[i+1]) {
	    		arr[j++] = arr[i];
	    	}
	    }
	    
	    arr[j++] = arr[arr.length-1];
	    
	    System.out.println("Array after removing duplicate elements");
		for(int i =0;i<j;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
