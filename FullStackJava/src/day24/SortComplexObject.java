package day24;

import java.util.ArrayList;
import java.util.Collections;

public class SortComplexObject {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(25);
		al.add(75);
		/*al.add("Arsh");
		al.add(10.5);
		al.add(true);*/
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(100);
		al2.add(50);
		al2.add(25);
		al2.add(75);
		
		System.out.println(al2);
		Collections.sort(al2);
		System.out.println(al2);
		
		
		
		
	}

}
