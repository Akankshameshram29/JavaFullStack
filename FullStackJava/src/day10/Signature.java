package day10;

public class Signature {

	public static void main(String ... args) {
		System.out.println("Hello");
		int [] a = {1,2,3,4,5};
		main(a);
		main();
		main('b');
	}
	
	public static void main(int [] a) {
		System.out.println("Main accepting integer type array");
	}
	
	public static void main() {
		System.out.println("Main accepting any arguments");
	}
	
	public static void main(char a) {
		System.out.println("Main accepting character array");
	}
	
}