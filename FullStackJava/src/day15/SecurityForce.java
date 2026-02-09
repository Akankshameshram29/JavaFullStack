package day15;

public interface SecurityForce {
   void protect();
   void job();
 
}
class Army implements SecurityForce{
	public void protect() {
		System.out.println("Protect Land");
	}
	public void job() {
		System.out.println("Land");
	}
}
class Navy implements SecurityForce{
	public void protect() {
		System.out.println("Protect Waterways");
	}
	public void job() {
		System.out.println("water bodies");
	}
}
class AirForce implements SecurityForce{
	public void protect() {
		System.out.println("Protect AirWays");
	}
	public void job() {
		System.out.println("Air");
	}
}
class SF{
	public static void main(String [] args) {
		duty(new Army());
	}
	static void duty(SecurityForce sf) {
		sf.job();
		sf.protect();
	}
}


