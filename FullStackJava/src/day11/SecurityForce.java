package day11;

public class SecurityForce {

	public static void main(String[] args) {
		 Army a = new Army();
		 a.job();
		 a.protect();
		 a.UseTank();
		 
		 Navy n = new Navy();
		 n.job();
		 n.protect();
		 n.useShips();
		 
		 AirForce af = new AirForce();
		 af.job();
		 af.protect();
		 af.useJets();
		 
		 
	}
	
	void job() {
		 System.out.println("Protect Nation");
	 }
    void protect() {
   	   System.out.println("Security Force is protecting") ;
   	 }

}

class Army extends SecurityForce{
	void protect() {
		System.out.println("Army is protecting");
	}
	
	void UseTank() {
		System.out.println("Army is using tank");
	}
}

class Navy extends SecurityForce{
	void protect() {
		System.out.println("Navy is protecting");
	}
	
	void useShips() {
		System.out.println("Navy is using Ships");
	}
}
class AirForce extends SecurityForce{
	void protect() {
		System.out.println("AirForce is protecting");
	}
	
	void useJets() {
		System.out.println("AirForce is using Jets");
	}
}
