package day23;
import java.util.Enumeration;
import java.util.Vector;

public class vectorDemo {

	public static void main(String[] args) {
	  Vector v = new Vector();
	  v.add(100);
	  v.add(200);
	  v.add(300);
	  v.add(400);
	  v.add(500);
	  v.add(600);
	  
	  Enumeration el = v.elements();
	  while(el.hasMoreElements()) {
		  System.out.println(el.nextElement()+" ");
	  }
	  
	}

}
