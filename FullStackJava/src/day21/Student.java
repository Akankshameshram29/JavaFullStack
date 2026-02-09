package day21;

public class Student {
  int age;
  String name;
  String gender;
  
  public Student(String name, String gender, int age) {
	  this.name = name;
	  this.gender = gender;
	  this.age = age;
  }
  
  public String getName() {
	  return name;
  }
  public String getgender() {
	  return gender;
  }
  public int getAge() {
	  return age;
  }

}


