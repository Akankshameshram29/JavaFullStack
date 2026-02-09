package day26;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demohm{

	public static void main(String[] args) {
		HashMap<Integer,Integer> hm = new HashMap();
		hm.put(100,99);
		hm.put(50, 9);
		hm.put(75,9999);
		hm.put(125,99999);
		hm.put(25,9999);
		System.out.println(hm);
		Set s = hm.keySet();
		System.out.println(s);
		
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	   Collection c = hm.values();
	   Iterator itr1 = c.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		Set s1 = hm.entrySet();
		Iterator itr2 = s1.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}
