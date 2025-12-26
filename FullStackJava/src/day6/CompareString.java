package day6;

public class CompareString {

	public static void main(String[] args) {
		String s1= "Akanksha";
		String s2= "Krupali";
		
		int res = s1.compareTo(s2);
		if(res > 0) {
			System.out.println("S1 is greater");
		}else if(res < 0) {
			System.out.println("S2 is greater");
		}else {
			System.out.println("Both are equal");
		}
		
		char a = 'c';
		int b = a;
		System.out.println(b);
		
		

	}

}
