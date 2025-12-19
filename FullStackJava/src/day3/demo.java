package day3;

public class demo {

	public static void main(String[] args) {
		byte a = 10; // implicit type casting
		int b = a;
		System.out.println(a);
		System.out.println(b);
		
		int c = 20;
		double d = c;
		System.out.println(c);
		System.out.println(d);
		
		//explicit 
		double e = 25.17;
		System.out.println(e);
		int f;
		f = (int) e;
		System.out.println(f);
		
		char ch = 'A';
	    int k = ch;
	    System.out.println(k);
	    
	    float s = (float)10.5;
	    System.out.println(s);
	    
	    long g = 216783647;
	    System.out.println(g);
	    
		

	}

}
