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

	@Override
	void education() {
		System.out.println("The surgeon went to medical school");
	}

	@Override
	void assist() {
		System.out.println("The surgeon has a nurse to assist them");
	}

	@Override
	void tools() {
		System.out.println("The surgeon has tools like scalpels");
	}
	
	

}
