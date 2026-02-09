package day11;

public class Const {

	public static void main(String[] args) {
		child1 c = new child1(100,99);
		System.out.println(c.a + " " +c.b);
	}

}

class parent3{
	int a;
	 int b;
	 public parent3() {
		 this(99,99);
		 a =10;
		 b =20;
		 System.out.println("zero parameterised");
	 }
	 
	 public parent3(int a , int b) {
		 this.a = a;
		 this.b = b;
		 System.out.println("2 parameterised");
	 }
}

class child1 extends parent3{
	public child1() {
		a =30;
		b =40;
		 System.out.println("zero parameterised child");
	}
	
	public child1(int a, int b) {
		this();
		this.a = a;
		this.b = b;
		 System.out.println("2 parameterised child");
	}
}
