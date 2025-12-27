package day8;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee E = new Employee(101,"Akanksha", 50000);
		System.out.println(E.getName());
		System.out.println(E.getID());
		System.out.println(E.getSalary());
		
		
		/*In the below program , the compiler will look for such a 
		constructor which does not except any arguement But their is no such constructor present in our class and hence we are going
		 to get compile time error only and only if the programmer has not define a constructor in the class, the compiler will add
		zero parameterised constructor, such a constructor provided by compiler when no constructor was provided
		by the programmer is know as default constructor.
	   */
		
		Employee E1 = new Employee(); 
		System.out.println(E1.getName()); 
		System.out.println(E1.getID()); 
		System.out.println(E1.getSalary());
		                                  
	}
}
