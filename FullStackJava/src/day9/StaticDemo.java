package day9;

public class StaticDemo {
  static int a;
  static int b;
  
  static {
	  a =100;
	  b =200;
  }
  
  int x;
  int y;
  
  {
	  a = 100;
	  b = 200;
	  x = 300;
	  y = 400;
  }
  
  
  
  static void disp() {
	  System.out.println(a);
	  System.out.println(b);
	  
  }
  
  
  
  
  
  {
	  x = 50;
	  y =70;
	  a = 300;
	  b= 500;
  }
  
  void disp2() {
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println(x);
	  System.out.println(y);
  }
}
