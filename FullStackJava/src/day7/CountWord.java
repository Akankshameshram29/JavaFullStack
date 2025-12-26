package day7;

import java.util.StringTokenizer;

public class CountWord {

	public static void main(String[] args) {
		int count = 0;
		String s = "Department of Artificial Intelligence & Data Science";
		StringTokenizer st = new StringTokenizer(s," ");
		while(st.hasMoreTokens()==true) {
			count+=1;
			st.nextToken();
	}
		
		System.out.println(count);

	}
	
	

}
