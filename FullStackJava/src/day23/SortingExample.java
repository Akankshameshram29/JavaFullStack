package day23;

import java.util.ArrayList;
import java.util.Collections;

public class SortingExample {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(12);
		al.add(98);
		al.add(76);
		al.add(87);
		al.add(23);
		al.add(45);
		al.add(34);
		
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		
		
	}

}
