package day12;

public class ParentApp {

	public static void main(String[] args) {
		ChildA c = new ChildA();
		c.disp();
		
	}
   
}

class parentA{
	 void disp() {
		System.out.println("this is parent method");
	}
}
class ChildA extends parentA{
	public void disp() {
		System.out.println("this is parent method");
	}
}

