package day14;

public abstract class Shape {

	public static void main(String[] args) {
		 
		Shape t= new Triangle(5,4);
		t.FindArea();
		t.disp();
		
		Shape s = new Square(5);
        s.FindArea();
        s.disp();

        Shape circ = new circle(3);
        circ.FindArea();
        circ.disp();

	}
	
	static double area;
	
	static double pi = 3.14;
	abstract void disp();
    abstract double FindArea();
}
class circle extends Shape{
	int radius;
	
	
	public circle(int radius) {
		this.radius = radius;
	}
	void disp() {
		System.out.println(area);
	}
	double FindArea() {
	    area  = pi * radius * radius;
	    return area;
	}
}

class Triangle extends Shape{
	int base;
	int height;
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	void disp() {
		System.out.println(area);
	}
	double FindArea() {
		area = 0.5 * base * height;
		return area;
	}
}
class Square extends Shape {
	int length;
	public Square(int length) {
		this.length = length;
	}
	void disp() {
		System.out.println(area);
	}
	double FindArea() {
		area = length * length;
		return area;
	}
}
