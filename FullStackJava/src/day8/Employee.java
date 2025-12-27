package day8;

public class Employee extends Object{
   private int Emp_id;
   private String name;
   private int salary;
   
   public Employee(int Emp_id, String name,int salary ) {
	   this.Emp_id = Emp_id;
	   this.name = name;
	   this.salary = salary;
	   
	   
   }
   
   public Employee() {
	   this(101, "SANCHI",15000);
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
