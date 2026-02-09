package day22;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
		ArrayDeque ad =new ArrayDeque<>();
        ad.add(100);
        ad.add(50);
        ad.add(150);
        ad.add(25);
        ad.add(75);
        ad.addFirst(125);
        
        System.out.println(ad);
        
        LinkedList ll = new LinkedList<>();
        ll.add(100);
        ll.add(50);
        ll.addLast(150);
        ll.addFirst(99);
        ll.add(25);
        ll.add(1,999);
        System.out.println(ll);
        System.out.println(ll.get(2));
        
        LinkedList ll2 = new LinkedList();
        ll2.push(10);
        ll2.push(20);
        ll2.push(30);
        
        System.out.println(ll2);
        
        System.out.println(ll2.pop());
        System.out.println(ll2.peek());
        System.out.println(ll2.peekFirst());
        System.out.println(ll2.peekLast());
        System.out.println(ll2);
        
	}

}
