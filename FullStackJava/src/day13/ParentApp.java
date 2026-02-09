package day13;

public class ParentApp {

	public static void main(String[] args) {
		child2 c = new child2();
		c.disp();
		
		
	}

}
class parent2{
	int x = 10;
	void disp() {
		System.out.println(x);
	}
}
class child2 extends parent2{
	int x = 20;
	void disp() {
		System.out.println(x);
		System.out.println(super.x);
		
	}
}