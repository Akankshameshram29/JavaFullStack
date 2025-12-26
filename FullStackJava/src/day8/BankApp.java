package day8;
import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the amount to deposit");
		Bank b = new Bank();
		int bal = sc.nextInt();
		b.setBalance(bal);
		System.out.println("Your current balance " + b.getBalance());
		System.out.println("Please enter the amount to withdram");
		int w = sc.nextInt();
		int updated_bal = b.getBalance() - w;
		b.setBalance(updated_bal);
		System.out.println("Your current balance " + b.getBalance());
		
	}

}

