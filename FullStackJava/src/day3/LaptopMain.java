package day3;

public class LaptopMain {

	public static void main(String[] args) {
	    Laptop L1 = new Laptop();
	    System.out.println("before assigning");
	    System.out.println(L1.brand);
	    System.out.println(L1.cost);
	    System.out.println(L1.microprocessor);
	    System.out.println(L1.os);
	    System.out.println("After assigning");
	    L1.brand = "HP";
	    L1.cost = 50000;
	    L1.microprocessor = "Windows";
	    L1.os = "Ryzen 5";
	    System.out.println(L1.brand);
	    System.out.println(L1.cost);
	    System.out.println(L1.microprocessor);
	    System.out.println(L1.os);
	    
	    
	    
	}

}
