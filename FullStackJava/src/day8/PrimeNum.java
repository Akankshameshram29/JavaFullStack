package day8;
import java.util.Scanner;


public class PrimeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean prime =  true;
        for(int i =2;i<Math.sqrt(num);i++) {
        	if(num % i == 0) {
        		prime =false;
        		System.out.println("Not a prime number");
        		break;
        		
        	}
        }
        if(prime == true) {
        	System.out.println(num + " is a prime number");
        }
        
	}

}
