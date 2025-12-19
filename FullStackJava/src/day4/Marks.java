package day4;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//for(int i =0;i<n;i++) {
				//	System.out.println(i);		
				//	}
				
   // write a java program to create an array which can store the marks of n students. Also you must take marks from user.
		
		System.out.println("Enter the number of students");
		int n = sc.nextInt();
		
		int [] marks = new int [n];
		for(int i =0;i<marks.length;i++) {
			System.out.println("Enter the marks of student" + i);
			marks[i] = sc.nextInt();
		}
       for(int i =0;i<marks.length;i++) {
    	   System.out.println("Marks of student"+ i + "=" + marks[i]);
       }
       
	}

}
