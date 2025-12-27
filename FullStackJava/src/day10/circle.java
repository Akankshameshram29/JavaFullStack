package day10;

public class circle {
	float radius;
	static float pi = 3.14f;

	
	public circle(float radius) {
		this.radius = radius;
		
		
	}
	
	float disp() {
		float res = radius * radius * pi;
		return res;
	}

}
