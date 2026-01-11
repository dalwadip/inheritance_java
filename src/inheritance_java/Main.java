package inheritance_java;
//where everything runs, create objects here

public class Main {

	public static void main(String[] args) {
		
		Surgeon surgeon = new Surgeon(true, true);
		Dentist dentist = new Dentist(true, true);
		
		System.out.println(surgeon.hasMD);
		surgeon.operate();
		surgeon.education();
		System.out.println(surgeon.is_active);
		
		System.out.println(dentist.hasMD);
		dentist.oralCare();
		dentist.education();
		System.out.println(dentist.treats_gum);

	}

}
