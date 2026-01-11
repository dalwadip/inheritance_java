package inheritance_java;

public class Surgeon extends Doctor{
	
	boolean is_active;
		
	Surgeon(boolean hasMD, boolean is_active) {
		super(hasMD);
		this.is_active = is_active;
	}
	
	void operate() {
		System.out.println("Surgeons operate on a person's body.");
	}

}
