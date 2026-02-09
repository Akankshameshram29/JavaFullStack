package day18;

public class KodEditor {

	public static void main(String[] args) {
		Typing t1 = new Typing();
		SpellCheck t2 = new SpellCheck();
		Saving t3 = new Saving();
		
		t1.start();
		t2.start();
		t3.start();

	}

}
class Typing extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("TYPING........");
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
class SpellCheck extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Spellchecking............");
		}
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
class Saving extends Thread{
	public void run() {
		for(int i =0;i<10;i++) {
			System.out.println("Saving................");
		}
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}