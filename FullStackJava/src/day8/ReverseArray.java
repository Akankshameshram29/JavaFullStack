package day8;

public class ReverseArray {

	public static void main(String[] args) {
		//reversed array
		int [] arr = {2,24,56,72,90};
        int j = arr.length-1;
		
		int [] c = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			c[i] = arr[j];
			j--;
		}
		
		for(int k=0;k<c.length;k++) {
			System.out.print(c[k] + " ");
		}
		

	}

}
