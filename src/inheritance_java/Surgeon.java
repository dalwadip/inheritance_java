package inheritance_java;

//inheritance
public class Surgeon extends Doctor{
	
	boolean is_active;
		
	Surgeon(boolean hasMD, boolean is_active) { //constructor to create unique objects
		super(hasMD); //calls parent class constructor
		this.is_active = is_active; //creates new attributes for subclass constructor
	}
	
	void operate() { //method
		System.out.println("Surgeons operate on a person's body.");
	}

	@Override //override existing method to fit this class
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
