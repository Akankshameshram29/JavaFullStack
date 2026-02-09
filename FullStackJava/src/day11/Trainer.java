package day11;

public class Trainer {

	public static void main(String[] args) {
		
		
		//Example 1
		
		JavaTrainer jt= new JavaTrainer();
		jt.teach();
		AptiTrainer at = new AptiTrainer();
		at.teach();
	    TestingTrainer tt = new TestingTrainer();
		tt.teach();
		
		//Example2
		Trainer t = new Trainer();
		t= new JavaTrainer();
		t.teach();
		t = new AptiTrainer();
		t.teach();
		t = new TestingTrainer();
		t.teach();
		
		//Example 3 Code Redundancy reduction //real polymorphism
		duty(new JavaTrainer());
		duty(new AptiTrainer());
		duty(new TestingTrainer());
		

	}
	
	static void duty(Trainer t) {
		t.teach();
	}
   
	 void teach() {
		 System.out.println("Trainer teaches");
	 }
}

class JavaTrainer extends Trainer{
	void teach() {
		System.out.println("Java Trainer teaches Java");
	}
}

class AptiTrainer extends Trainer{
	void teach() {
		System.out.println("Aptitude Trainer teaches Aptitude");
	}
}

class TestingTrainer extends Trainer{
	void teach() {
		System.out.println("Testing Trainer teaches testing");
	}
}
