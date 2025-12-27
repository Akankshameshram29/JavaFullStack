package day9;

public class Employee {
   private int emp_id;
   private String name;
   private int salary;
   
   public Employee() {
	   this(101,"Akanksha",15000);
	   System.out.println("0 parameterised constructor is called");
	   }
   public Employee(int emp_id) {
	   System.out.println("1 parameterised constructor is called");
   }
   public Employee(int emp_id, String name) {
	   this(101);
	   System.out.println("2 parameterised constructor is called");
   }
   public Employee(int emp_id, String name, int salary) {
	   this(101, "Akanksha");
	   System.out.println("3 parameterised constructor is called");
   }
}
