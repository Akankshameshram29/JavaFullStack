package day15;
import java.util.*;

public class KodCalciApp {
	public static void main(String[] args) {
		operation(new AkankshaAnalytics());
		operation(new DeltaIntelligence());

	}
	static void operation(KodCalci obj) {
		obj.add();
		obj.div();
		obj.mul();
		obj.div();
		((AkankshaAnalytics)(obj)).mod();//downcasting rule number 5
	}
	void duty(KodCalci c, char operator) {
		switch(operator) {
		case '+':
			c.add();
			break;
		case '-':
			c.sub();
			break;
		case '*':
			c.mul();
			break;
		case '/':
			c.div();
            break;			
		}
	}
}

class AkankshaAnalytics implements KodCalci{
	public void add() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	public void sub() {
		int a = 50;
		int b = 30;
		int c = a-b;
		System.out.println(c);
	}
	public void mul() {
		int a = 5;
		int b = 3;
		int c = a*b;
		System.out.println(c);
	}
	public void div() {
		int a = 100;
		int b = 10;
		int c = a/b;
		System.out.println(c);
	}
	void mod() {
		int a = 3;
		int b = 2;
		int c = a % b;
		System.out.println(c);
	}
}
interface kodcalci1{
	void add();
	void sub();
}
interface kodcalci2 extends kodcalci1{  //rule 8
	void mul();
	void div();
	void mod();
}

class DeltaIntelligence implements KodCalci,kodcalci1,kodcalci2{
	 public void add() {
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 System.out.println("Addition :"+ (a+b));
	 }
	 public void sub() {
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 System.out.println("Substraction :"+ (a-b));
	 }
	 public void mul() {
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 System.out.println("Multiplication :"+ (a*b));
	 }
	 public void div() {
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 System.out.println("Division :"+ (a/b));
	 }
	 public void mod() {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			 System.out.println("Mod :"+ (a%b));
	 }
	 
	 
}

