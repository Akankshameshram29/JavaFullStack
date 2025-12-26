package day8;

public class Employee {
   private int Emp_id;
   private String name;
   private int salary;
   
   public Employee(int Emp_id, String name,int salary ) {
	   this.Emp_id = Emp_id;
	   this.name = name;
	   this.salary = salary;
	   
	   
   }
   
   String getName() {
	   return name;
   }
   
   int getID() {
	   return Emp_id;
   }
   
   int getSalary() {
	   return salary;
   }
  
   
   
}
