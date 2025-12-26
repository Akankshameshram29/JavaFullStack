package day8;

public class ShadowingProblem {
	   private String name ;
	   private int age;
	   private String gender;
	   
	   public ShadowingProblem(String name , int age, String gender) {
		   this.name = name;
		   this.age = age;
		   this.gender = gender;
	   }
	   
	   public String getName() {
		   return name;
	   }
	   public String getGender() {
		   return gender;
	   }
	   public int getAge() {
		   return age;
	   }
	   
	   
	   
	   
}
