package Day17;
import java.sql.SQLException;

public class ParentAPP {
     public static void main(String[]args) {
    	 disp1();
     }
     static void disp() {
    	 System.out.println("hello from disp");
    	 disp();
     }
     static void disp1() {
    	 System.out.println("hello");
    	 try {
    		 disp();
    	 }catch(Error e) {
    		 System.out.println("Error handled");
    	 }
     }
}
class parent{
	void disp() throws SQLException {
		
	}
}
class child extends parent{ //same exception or no exception
	void disp() throws SQLException {
		
	}
}

class parent1{//rule2
	void disp() throws SQLException {
		
	}
}
class child1 extends parent1{  //rule2
	void disp() throws ArithmeticException {
		
	}
}

//rule3
class parent2{
	void disp() throws ArithmeticException{
		
	}
}
class child2 extends parent1{  //rule2
	void disp() throws RuntimeException{
		
	}
}