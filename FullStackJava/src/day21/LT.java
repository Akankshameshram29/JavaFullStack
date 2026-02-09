package day21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LT {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		
		Iterator litr = al.listIterator();
		while(litr.hasNext()) {
			System.out.print(litr.next()+ " ");
		}
		
		ListIterator list = al.listIterator(al.size());
		while(list.hasPrevious()) {
			System.out.print(list.previous() + " ");
		}
		
		//descending iterator
		LinkedList<Integer> al1 = new LinkedList<>();

		Iterator<Integer> itr = al1.descendingIterator();
		while (itr.hasNext()) {
		    System.out.print(itr.next() + " ");
		}

	}

}
