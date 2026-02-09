package day21;

import java.util.ArrayList;
import java.util.Iterator;

public class ForEach {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		System.out.println(al);
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+ " ");
		}
		System.out.println();
		System.out.println("-----------------------");
		for(Object x:al) {
			System.out.print(x + " ");
		}
		//iterator
		Iterator itr =  al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+" "
					+ ""
					+ ".");
		}
		
	}

}
