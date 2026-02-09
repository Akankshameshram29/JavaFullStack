package day18;

public class Demo {

	public static void main(String[] args) {
		Thread t =Thread.currentThread();
		t.setName("PCE");	
		t.setPriority(7);
		System.out.println(t);
		duty();
	}

	static void duty() {
		Thread t = Thread.currentThread(); //one thread
		System.out.println(t);
	}
	
}
