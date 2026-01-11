package inheritance_java;

public class Dentist extends Doctor{
	
	boolean treats_gum;
		
	Dentist(boolean hasMD, boolean treats_gum) {
		super(hasMD);
		this.treats_gum = treats_gum;
	}
	
	void oralCare() {
		System.out.println("The dentist take care of oral healthcare.");
	}

	@Override
	void education() {
		System.out.println("The dentist went to dental school");
	}

	@Override
	void assist() {
		System.out.println("The surgeon has a dental assistant");
	}

	@Override
	void tools() {
		System.out.println("The surgeon has tools like mouth mirror");
	}
	
	

}
