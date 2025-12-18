package day1;

public class Pattern {

	public static void main(String[] args) {
		// pattern - *****
		for(int i =0;i<5;i++) {
			System.out.print("*");		
			}
       
		/*pattern *
		          *
		          *
		          *
		          *       */
		
		for(int i =0;i<=5;i++) {
			System.out.println("*");
		}
		
		/* pattern *****
		           *****
		           *****
		           *****
		           *****
		 */
		
		for(int i =0;i<5;i++) {
			for(int j =0;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*  *****  <-pattern
		    *   *
		    *   *
		    *   *
		    *****
		    
		 */
		
		for(int i =0;i<5;i++) {
			if(i==0 || i==4) {
				for(int j =0;j<5;j++) {
					System.out.print("*");
				}
			}
			else{
				for(int j=0;j<5;j++) {
					if(j==0 || j==4) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println("");
		}
	}

}
