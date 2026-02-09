package day13;

public class FinalVariable {

	public static void main(String[] args) {
		final int a;
		a = 29;
		//a = 30; final variable cannot be reinitialised
		System.out.println(a);
        parent c = new child();
        c.disp();
	}

}
class parent {
	final void disp() { //cannot override the final method from parent
		System.out.println("this is parent");
	}
}
class child extends parent{
	/*void disp() {
		System.out.println("this is child method"); final method cannot be overridden
	}*/
}
