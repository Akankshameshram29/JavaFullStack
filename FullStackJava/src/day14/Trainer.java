package day14;

public abstract class Trainer {

	public static void main(String[] args) {
		duty(new JavaTrainer());
		duty(new AptiTrainer());
		duty(new TestingTrainer());
	}
	static void duty(Trainer t) {
		t.teach();
	}
	abstract void teach();

}
class JavaTrainer extends Trainer{
	void teach() {
		System.out.println("Teaching Java");
	}
}
class AptiTrainer extends Trainer{
	void teach() {
		System.out.println("Teaching Aptitude");
	}
}
class TestingTrainer extends Trainer{
	void teach() {
		System.out.println("Teaching QA testing");
	}
}
