package Day17;
import java.util.Scanner;
public class testApp {

	public static void main(String[] args) {
		
		System.out.println("Main connection Established");
		Test1 t1 = new Test1();
		t1.alpha();
		System.out.println("Main connection Terminared");

	}

}
class Test1{
	void alpha() {
		System.out.println("Connection 1 Established");
		Test2 t2 = new Test2();
		t2.beta();
		System.out.println("Connection 1 terminated");
	}
}
class Test2{
	void beta() {
		System.out.println("Connection 2 Established");
	
	Test3 t3 = new Test3();
	try {
	t3.gamma();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	System.out.println("Connection 2 Established");
	}
}

class Test3{
	void gamma() throws Exception {
	Scanner sc = new Scanner(System.in);
	System.out.println("Connection 3 Establsied");

	//try {
	System.out.println("please enter value 1");
	int a = sc.nextInt();
	System.out.println("please enter value 2");
	int b = sc.nextInt();
	int c = a/b;
	System.out.println(c);
	/*}catch(Exception e) {
		System.out.println("Exception handles by gamma");
	}*/
	
	System.out.println("Connection 3 terminated");
	}
}
