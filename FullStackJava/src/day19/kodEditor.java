package day19;

public class kodEditor{
	public static void main(String[] args) {
		kodEditor1 t1=new kodEditor1();
		kodEditor1 t2=new kodEditor1();
		kodEditor1 t3=new kodEditor1();
		t1.setName("Type");
		t2.setName("Spell");
		t3.setName("Save");
		t1.start();
		t2.start();
		t3.start();
	}

	

}
class kodEditor1 extends Thread{
	public void run() {
		String tName=Thread.currentThread().getName();
		if(tName.equals("Type")){
			typing();
		}
		else if (tName.equals("Spell")) {
			spellCheck();
		}
		else {
			saving();
		}
				
	}
	
	void typing() {
		
		for(int i=0; i<10; i++) {
			System.out.println("Typing");
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	void spellCheck() {
		
		for(int i=0; i<10; i++) {
			System.out.println("SpellCheck");
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	void saving() {
		for(int i=0; i<10; i++) {
			System.out.println("Saving");
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
				
			}
		}
	}
	
	void sleepThread() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	
	
}