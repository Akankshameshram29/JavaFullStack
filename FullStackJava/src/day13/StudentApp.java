package day13;

public class StudentApp {

	public static void main(String[] args) {
		student s = new student();
		Bike b = new Bike("Pulsar",100000,"Black");
		Book b1 = new Book("The art of being alone", 500);
		
		System.out.println(b.getBrand());
		System.out.println(b.getPrice());
		System.out.println(b.getColor());
		System.out.println("----------------");
		s.hasA(b);
		System.out.println("-------------------");
		System.out.println(s.h.getJob());
		System.out.println(s.h.getWeight());
		System.out.println("-------------------");
		s.hasA(b1);
		System.out.println("----------------------");
		System.out.println(s.b2.getJob());
		System.out.println(s.b2.getWeight());
		

	}

}
class student {
	
	Heart h = new Heart("to pump blood",2);
	void hasA(Bike obj) {
		System.out.println(obj.getBrand());
		System.out.println(obj.getPrice());
		System.out.println(obj.getColor());
	}
	Brain b2 = new Brain("to send signal", 100);
	void hasA(Book obj) {
		System.out.println(obj.getName());
		System.out.println(obj.getPrice());
		
	}
	
}

class Brain{
	String job;
	int weight;
	public Brain(String job, int weight) {
	    this.job = job;
	    this.weight = weight;
	}

	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getJob() {
		return job;
	}
	public void  setJob(String job) {
		this.job = job;
	}
	
	
	
}

class Book{
	String name;
	int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void  setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
class Bike{
	String brand;
	int price;
	String color;
	
	public Bike(String brand, int price, String color) {
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	
	public String getBrand() {
		return brand;
	}
	public void  setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void  setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void  setColor(String color) {
		this.color = color;
	}
}
class Heart{
	int weight;
	String job;
	
	public Heart(String job, int weight) {
		this.weight = weight;
		this.job = job;
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getJob() {
		return job;
	}
	public void  setJob(String job) {
		this.job = job;
	}
}

