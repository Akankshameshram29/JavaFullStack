package day3;
import java.util.Scanner;

public class FormMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Form f1  = new Form();
		System.out.println("Enter your rollno");
		f1.rollno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your name");
		f1.Name = sc.nextLine();
		
		System.out.println("Enter your erp");
		f1.Epr_id = sc.nextLong();
		sc.nextLine();
		
		System.out.println("Enter your Department");
		f1.Depertment = sc.nextLine();
		
		System.out.println("Enter your Education year");
		f1.year = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter your mobile number");
		f1.Mobile_nO = sc.nextLine();
		System.out.println("Enter your Section");
		f1.section = sc.next();
		
		System.out.println("Thank you for filling the information!!");
		
		
		
		
	}

}
