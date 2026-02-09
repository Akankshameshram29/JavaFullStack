package day23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ALDemo {

	public static void main(String[] args) {
		CopyOnWriteArrayList al = new CopyOnWriteArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		
		/*for(int i =0;i<al.size();i++) {
			System.out.println(al.get(i)+ " ");
			al.add(i);
		}*/
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			al.add(50);
		}
		Iterator itr2 = al.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}
