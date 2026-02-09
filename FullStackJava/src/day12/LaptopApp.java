package day12;

public class LaptopApp {

	public static void main(String[] args) {
		Laptop l = new Laptop();
		Charger c = new Charger("Dell",65);
		l.hasA(c);
		System.out.println(l.os.getBrand());
		

	}

}
class Laptop{
	os os = new os("win", 10.0);
	void hasA(Charger c) {
		System.out.println(c.getBrand());
		System.out.println(c.getPower());
		
	}
	
}
class Charger{
	String brand;
	int power;
	public Charger(String brand, int power) {
		super();
		this.brand = brand;
		this.power = power;
	}
	public String getBrand() {
		return brand;
	}
	public int getPower() {
		return power;
	}
	public void  setBrand(String brand) {
		this.brand = brand;
	}
	public void  setPower(int power) {
		this.power = power;
	}
}
class os{
	String brand;
	double version;
	public os(String brand, double version) {
		this.brand = brand;
		this.version = version;
	}
	public String getBrand() {
		return brand;
	}
	public void  setBrand(String brand) {
		this.brand = brand;
	}
	public double getVersion() {
		return version;
	}
	public void setVersion() {
		this.version = version;
	}
}