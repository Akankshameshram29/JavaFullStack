package day20;


public class WashroomApp {

	public static void main(String[] args) throws InterruptedException {
		Washroom w = new Washroom();
		Thread t1 = new Thread(w);
		Thread t2 = new Thread(w);
		Thread t3 = new Thread(w);
		
		t1.setName("Thor");
		t2.setName("Loki");
		t3.setName("Hulk");
		
		//first method
		//t1.start();
		//t2.start();
		//t3.start();
		
		/* second method
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join(); */
		
		//third method
		t1.start();
		t2.start();
		t3.start();
		
	}

}

class Washroom implements Runnable{

	@Override
	 synchronized public void run() {
		try {
		String tName = Thread.currentThread().getName();
		System.out.println(tName + " is entering the washroom");
		Thread.sleep(3000);
		System.out.println(tName + " is using the Washroom");
		Thread.sleep(3000);
		System.out.println(tName + " is exiting the washroom");
	}catch(InterruptedException e){
		e.printStackTrace();
	}
		
	}
	
}
