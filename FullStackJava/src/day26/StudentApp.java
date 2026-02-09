package day26;

import java.util.HashMap;

public class StudentApp {

	public static void main(String[] args) {
		
		Student s1 = new Student(
                "Akanksha", 21, "Female", "9876543210",
                "akanksha@gmail.com", "O+", 5.4f, 52.5f,
                6, "Computer Science");

        Student s2 = new Student(
                "Krupali", 22, "Female", "9123456780",
                "krupali@gmail.com", "A+", 5.3f, 50.0f,
                6, "Information Technology");

        Student s3 = new Student(
                "Sanchi", 21, "Female", "9988776655",
                "sanchi@gmail.com", "B+", 5.5f, 54.0f,
                5, "Electronics");
        
        HashMap<Integer, Student> map = new HashMap<>();
        map.put(101, s1);
        map.put(102, s2);
        map.put(103, s3);
        
        
        
    
        

	}

}
