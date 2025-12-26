package day5;
import java.util.Scanner;

public class Jagged3d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of colleges");
		int c1 = sc.nextInt();
        int [][][] college = new int[c1][][];
        //input
        for(int i =0;i<c1;i++) {
        	System.out.println("Enter the number of classes in college " + i);
        	int c2 = sc.nextInt();
        	college[i] = new int[c2][];
        	for(int j =0;j<college[i].length;j++) {
        		System.out.println("Enter the number of students in class " +j + "of college " + i );
        		int s = sc.nextInt();
        		college[i][j] = new int[s];
        		for(int k =0;k<college[i][j].length;k++) {
        			System.out.println("Enter the marks of Student " + k + "of class" + j + "of college " +i);
        			college[i][j][k] =sc.nextInt();
        		}
        	}
        }
        
        //output
        for(int i =0;i<c1;i++) {
        	for(int j =0;j<college[i].length;j++) {
        		for(int k =0;k<college[i][j].length;k++) {
        			System.out.println(college[i][j][k]);
        		}
        	}
        }
        
        
        //Storing the names of Students of class of 3 colleges
        
        int n = sc.nextInt();
        String [][][] names = new String [n][][];
        for(int i =0;i<n;i++) {
        	System.out.println("Enter the number of classes in college " + i);
        	int c2 = sc.nextInt();
        	names[i] = new String[c2][];
        	for(int j =0;j<names[i].length;j++) {
        		System.out.println("Enter the number of students in class " +j + "of college " + i );
        		int s = sc.nextInt();
        		names[i][j] = new String[s];
        		for(int k=0;k<names[i][j].length;k++) {
        			System.out.println("Enter the name of Student " + k + "of class" + j + "of college " +i);
        		    names[i][j][k] = sc.nextLine();
        		}
        	
        	}
        }
	}

}
