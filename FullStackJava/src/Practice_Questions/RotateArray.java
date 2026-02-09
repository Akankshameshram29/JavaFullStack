package Practice_Questions;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = {1,2,3,4,5,6,7};
		System.out.println("Enter k step for rotation");
		int k = sc.nextInt();
		 System.out.println("Array before k rotation");
	        for(int i=0;i<arr.length;i++) {
	        	System.out.print(arr[i] + " ");
	      }
	    System.out.println();
		
		if(k > arr.length){
            k = k % arr.length;
        }
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        
        System.out.println("Array after k rotation");
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i] + " ");
        }


	}
	 public static void reverse(int [] nums,int start, int end){
	        while(start<=end){
	            int temp = nums[start];
	            nums[start] = nums[end];
	            nums[end] = temp;
	            start++;
	            end--;
	        }
	    }

}
