package Day17;

import java.util.Scanner;

public class BankApp {
	public static void main(String[] args) {
		Bank b=new Bank();
		b.banking();
		
	}

}
class Bank{
	
	void banking() {
		System.out.println("Bank Connection is established");
		ATM Card=new ATM();
		try {
			Card.acceptInfo();
			Card.verify();
		} catch (InvalidInputException e) {
		System.out.println("Wrong Pin");
		System.out.println("Attempt 2");
		 try {
			 Card.acceptInfo();
		     Card.verify();
		 }catch(InvalidInputException e1){
			System.out.println("Wrong Pin");
			System.out.println("Attempt 3");
			try {
				Card.acceptInfo();
				Card.verify();
			}catch(InvalidInputException e2) {
				System.out.println("Wrong Pin");
				System.out.println("Card blocked for 24 hours");
			}
		 }
	  }
	
	
  }
}
class ATM{
	
	int user_acc;
	int user_pass; 
	int acc_no= 1012;
	int password= 3054;
	
	void acceptInfo(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your account number");
		user_acc = sc.nextInt();
		System.out.println("Enter your password");
		user_pass = sc.nextInt();
		
	}
	
	void verify() throws InvalidInputException{
		if(acc_no == user_acc  &&  password==user_pass) {
			System.out.println("Access given Successfully");
		}else {
			throw new InvalidInputException();
		}
	}
	void transaction() throws Exception {
		System.out.println("ATM Connection established");
		Scanner input=new Scanner(System.in);
		System.out.println("please Enter value1: ");
		int a=input.nextInt();
		System.out.println("Bank Enter value2: ");
		int b=input.nextInt();
		try {
			int c=a/b;
			System.out.println(c);
			
		} catch (Exception e) {
			System.out.println("exception handled by ATM");
			throw e;
		}
		finally {
		System.out.println("ATM connection terminated");
		input.close();
		
	   }
	}
}
class InvalidInputException extends Exception{
	public String getMessage() {
		return "Wrong Credentials";
	}
}