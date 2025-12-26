package day7;

public class Calculator {
  //no input - no output
	void add() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
		}
	
  //no input - output
	int add1() {
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;
		}
 //input- no output
	void add2(int a , int b) {
		int c = a+b;
		System.out.println(c);
	}
	
 //input-output
	int add3(int a, int b) {
		int c = a+b;
		return c;
	}

}
