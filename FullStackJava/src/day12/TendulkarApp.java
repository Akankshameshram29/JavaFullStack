package day12;

public class TendulkarApp {
  public static void main(String [] args) {
	  Tendulkar t = new ArjunTendulkar();
	  t.job();
	  t.profession();
	 // t.smoking(); parent type reference cannot access specialised method, it can only access overridden or inherited method
	  ((ArjunTendulkar)t).smoking();//down casting
  }
}

class Tendulkar{
	void job() {
		System.out.println("PLay Cricket");
	}
	
	void profession() {
		System.out.println("he is batsman");
	}
}

class ArjunTendulkar extends Tendulkar{
	void profession() {
		System.out.println("he is boller");
	}
	void smoking() {
		System.out.println("He smokes some time");
	}
}
