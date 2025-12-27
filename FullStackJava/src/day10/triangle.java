package day10;

public class triangle {
   int base;
   int height;
   
   
   public triangle(int base , int height) {
	   this.base = base;
	   this.height = height;
   }
   
   double disp() {
	   double res = 0.5 * base * height;
	   return res;
   }
}
