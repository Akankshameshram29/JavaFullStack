package day6;

public class SelectionSort {

	public static void main(String[] args) {
		int [] arr = {7,4,5,9,8,3,2};
		
		System.out.println("BEFORE SORTING");
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int i =0;i<arr.length-1;i++) {
			int min_index = i;
			for(int j = i+1;j<arr.length;j++) {
				   if(arr[j] < arr[min_index]) {
					   min_index = j;
				   }
			}
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
			
		}
		
		System.out.println("AFTER SORTING");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
