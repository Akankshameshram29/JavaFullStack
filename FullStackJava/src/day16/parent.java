package day16;

public class parent {
	//method overriding and method hiding

	public static void main(String[] args) {
		parent p = new parent();
		p.disp();
		child c = new child();
		c.disp();
		parent p1 = new child();
		p1.disp();

	}
    static void disp() {
    	System.out.println("this is parent method");
    }
}
class child extends parent{
	static void disp() {
		System.out.println("this is child");
	}
}
