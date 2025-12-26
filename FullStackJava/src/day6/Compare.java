package day6;

public class Compare {

	public static void main(String[] args) {
		String s1 = "Akanksha";
		String s2 = "akanksha";
		
		String s3 = "Akanksha " + "Meshram";
		String s4 = "Akanksha Meshram";
		
		
		
		
		/*if(s3 == s4) {
			System.out.println("References are equal");
		}else {
			System.out.println("References are not equal");
		}
		if(s3.equals(s4)) {
			System.out.println("Values are equal");
		}else {
			System.out.println("Values are not equal");
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("values are equal");
		}else {
			System.out.println("Values are not equal");
		}
		*/
		
		String s5 = new String("Deep");
		String s6 = s5.intern();
		String s7 = s5.intern();
		if(s6 == s7) {
			System.out.println("References are equal");
		}else {
			System.out.println("References are not equal");
		}
		
	}

}
