package day24;

public class Students {

	public static void main(String[] args) {
		Student s = new Student("Akanksha","Female",22);
		System.out.println(s.toString());
	}
}


class Student{
		String name;
		int age;
		String gender;
		
	   public Student(String name, String gender, int age) {
				  this.name = name;
				  this.gender = gender;
				  this.age = age;
        }
			public String getName() {
		        return name;
			}
			
			public void setName(String name) {
		        this.name = name;
			}
			
			public String getGender() {
		        return gender;	
			}
			
		    public void setGender(String gender) {
		    	this.gender = gender;
		    }
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public String toString() {
			  return name + " " + age + " " +gender;
			}
}
