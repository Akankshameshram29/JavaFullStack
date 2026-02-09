package day11;

public class ParentApp {

	public static void main(String[] args) {
		Child c =new Child();
		//System.out.println(c.a);
		System.out.println("-----------------------------------");
		//c.disp(); //private member of parent class is not accessible.
	}
}
	
	class Parent{
		private int a = 10;
		int b = 20;
		private void disp() {
			System.out.println(a);
			System.out.println(b);
		}
	}
	
	class Child extends Parent{
		
	}


