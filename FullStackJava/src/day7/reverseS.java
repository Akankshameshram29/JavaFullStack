package day7;

import java.util.*;

public class reverseS {

	public static void main(String[] args) {
				String s = "Department of Artificial Intelligence & Data Science";
				StringTokenizer st = new StringTokenizer(s," ");
				String s1 = " ";
				while(st.hasMoreTokens()==true) {
					s1 = st.nextToken() + " " + s1;
				}

				System.out.println(s1);
		}

}



