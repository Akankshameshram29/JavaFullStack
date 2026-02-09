package day14;

public class BirdApp {

	public static void main(String[] args) {
		duty(new VegSparrow());
		duty(new NonVegSparrow());
	}
	
	static void duty(Bird b) {
		b.eat();
		b.fly();
	}

}
abstract class Bird{
	int x;
	abstract void eat();
	abstract void fly();
}
abstract class Sparrow extends Bird{
	/*void eat() {
		System.out.println("sparrrow is eating");
		}*/
	void fly() {
		System.out.println("Sparrow is flying");// if we dont implement abstract method from parent class , we get error. 
	}
}
class VegSparrow extends Sparrow{
	void eat() {
		System.out.println("veg sparrow eats grain");
	}
}
class NonVegSparrow extends Sparrow{
	void eat() {
		System.out.println("Nonveg sparrow eats worms");
	}
}