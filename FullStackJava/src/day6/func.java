package day6;

public class func {

	public static void main(String[] args) {
		String s1 = "Akanksha";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.contains("a"));
        System.out.println(s1.substring(3));
        System.out.println(s1.charAt(5));
        
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("Akanksha");
        System.out.println(sb.capacity());
        sb.append("Meshram");
        System.out.println(sb);
        System.out.println(sb.capacity());
        
        //Ensure 

        StringBuffer sb1 = new StringBuffer();
        sb1.ensureCapacity(31);
        System.out.println(sb1.capacity());      
        
        sb1.trimToSize();
        System.out.println(sb1.capacity());
        
	}

}
