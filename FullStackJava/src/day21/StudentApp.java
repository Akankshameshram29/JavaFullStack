package day21;

public class StudentApp {

	public static void main(String[] args) {
		Student st1 = new Student("Akanksha","Female",22);
		Student st2 = new Student("Krupali","Female",22);
		Student [] arr = {st1,st2};
		for(Student s: arr) {
			System.out.println(s.getName());
			System.out.println(s.getAge());
			System.out.println(s.getgender());
		}

	}

}
