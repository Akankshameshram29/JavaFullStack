package Practice_Questions;

public class MinMaxArray {

	public static void main(String[] args) {
		int [] arr = {5,7,8,3,2,5};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length;i++){
			if(arr[i] < min) {
				min = arr[i];
			}
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("Maximum element " + max);
		System.out.println("Minimum element " + min);
	}	
}
	


