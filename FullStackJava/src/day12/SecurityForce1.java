package day12;



 abstract class SecurityForce1 {

	public static void main(String[] args) {
		duty(new Army());
		duty(new Navy());
		duty(new AirForce());
	}
	
	
    abstract void protect();
    
    static void duty(SecurityForce1 sf) {
    	sf.protect(); //In the above method, it is certain that protect method must be overridden by the child classes. Hence their is no need of the method in the parent class.
    	  //if we try to remove the method from the parent class, the corresponding methods present in the child class will become specialised as a parent type reference cannot 
    	//access the specialised method of the child class, so that we will not able to achieve benefits of polymorphism. To overcome the problem in the above problem we use 
    	//abtraction. 
    }

}

class Army extends SecurityForce1{
	void protect() {
		System.out.println("Army is protecting");
	}
	
	void UseTank() {
		System.out.println("Army is using tank");
	}
}

class Navy extends SecurityForce1{
	void protect() {
		System.out.println("Navy is protecting");
	}
	
	void useShips() {
		System.out.println("Navy is using Ships");
	}
}
class AirForce extends SecurityForce1{
	void protect() {
		System.out.println("AirForce is protecting");
	}
	
	void useJets() {
		System.out.println("AirForce is using Jets");
	}
}
