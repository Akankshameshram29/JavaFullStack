package day20;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add("Akanksha");
		al.add(true);
		
		System.out.println(al);
		
		LinkedList ll = new LinkedList<>();
		ll.add(45);
		ll.add("Akanksha");
		ll.add(70);
		ll.add(3.6);
		System.out.println(ll);
	    ll.add(null);
		ArrayList arr = new ArrayList<>();
		arr.addAll(al);
		System.out.println(arr);
		arr.add(1,90);
		System.out.println(arr);
		System.out.println(arr.contains(30));
		arr.remove(1);
		System.out.println(arr);
		arr.retainAll(arr);
		System.out.println(arr);
		
		al.add(null);
		System.out.println(al);
		
	
		
	}
}




