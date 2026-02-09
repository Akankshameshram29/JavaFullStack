package day23;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Vector;

public class AL {
	
	    public static void main(String[] args) {

	       Vector<Integer> al = new Vector<>();

	        al.add(10);
	        al.add(20);
	        al.add(30);
	        al.add(40);
	        al.add(50);

	        // 1. Using for loop
	        for (int i = 0; i < al.size(); i++) {
	            System.out.println(al);
	        }

	        // 2. Enhanced for loop
	        for (int i : al) {
	            System.out.println(i);
	        }

	        // 3. Iterator
	        Iterator<Integer> itr = al.iterator();
	        while (itr.hasNext()) {
	            System.out.println(itr.next());
	        }

	        // 4. ListIterator (forward)
	        ListIterator<Integer> litr = al.listIterator();
	        while (litr.hasNext()) {
	            System.out.println(litr.next());
	        }
	        
	       /* Iterator<Integer> ditr = al.descendingIterator();
	        while (ditr.hasNext()) {
	            System.out.println(ditr.next());
	        }
	        */
	        
	        Enumeration<Integer> e = al.elements();
	        while (e.hasMoreElements()) {
	            System.out.println(e.nextElement());
	        }
	}


}
