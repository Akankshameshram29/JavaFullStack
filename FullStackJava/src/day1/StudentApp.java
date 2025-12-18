package day1;

public class StudentApp {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("Before Assigning");
		System.out.println(s1.age);
		System.out.println(s1.name);
		System.out.println(s1.gender);
		System.out.println("After assigning value");
	    s1.name= "Akanksha Meshram";
	    s1.age = 22;
	    s1.gender = "female";
	    System.out.println(s1.name);
	    System.out.println(s1.age);
	    System.out.println(s1.gender);
		

	}

}
