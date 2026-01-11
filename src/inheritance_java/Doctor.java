package inheritance_java;

public class Doctor {
	
	boolean hasMD;
	
	Doctor(boolean hasMD){
		this.hasMD = hasMD;
	}
	
	void education() {
		System.out.println("All doctors have gone to their own special educational institute for practice/studies.");
	}

}
