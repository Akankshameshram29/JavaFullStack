package day26;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

public class PassengerApp {

	public static void main(String[] args) {
		PassengerDetail p1 = new PassengerDetail(101,"Akanksha Meshram", "Nagpur", "Pune", "Train");
		PassengerDetail p2 = new PassengerDetail(117,"Krupali Shivankar", "Nagpur", "Chimur", "Bus");
		PassengerDetail p3 = new PassengerDetail(105,"Sanchi Muneshwar", "Nagpur", "wapas apne ghar", "BailGadi");
		ArrayList al = new ArrayList();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		System.out.println(al);
		Comparator<PassengerDetail> c = new PassengerDetail(0, null, null, null, null);

        Collections.sort(al, c);

        System.out.println("After Sorting by ID:");
        System.out.println(al);
		
	}

}
