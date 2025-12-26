package day4;
import java.util.Scanner;

public class College {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		 System.out.println("Enter the number of classes");
		 int n = sc.nextInt();
		 System.out.println("Enter the number of students in class");
		 int m = sc.nextInt();
		 sc.nextLine();
		 
		 
		 int [][] marks = new int[n][m];
		 for(int i =0;i<marks.length;i++) {
			 System.out.println("Marks of class" + i);
			 for(int j =0;j<marks[i].length;j++) {
				 System.out.println("Enter the marks of student" + j + "from class " + i);
				 marks[i][j] = sc.nextInt();
			 }
			 
		}
        
		for(int i=0;i<marks.length;i++) {
			for(int j =0;j<marks[0].length;j++) {
				System.out.print(marks[i][j] + " ");
			}
			System.out.println();
		}
		
		
		//2d jagged array
		
		
		System.out.println("Enter the number of classes");
		int c = sc.nextInt();
		int [][] a = new int [c][];
		for(int i =0;i<c;i++) {
			System.out.println("Enter the number of student present in class" + i);
			int r = sc.nextInt();
			 a[i] = new int[r];
			 for(int j =0;j<a[i].length;j++) {
				System.out.println("enter the marks");
				a[i][j] = sc.nextInt();
			 }
			
		}
		
		for(int i =0;i<a.length;i++) {
			for(int j =0;j<a[i].length;i++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
