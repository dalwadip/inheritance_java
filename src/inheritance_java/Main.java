package inheritance_java;

import java.awt.print.Printable;
import java.io.PrintStream;

//where everything runs, create objects here

public class Main {

	public static void main(String[] args) {
		
		Surgeon surgeon = new Surgeon(true, true);
		Dentist dentist = new Dentist(true, true);
		
		System.out.println(surgeon.hasMD);
		surgeon.operate();
		surgeon.education();
		System.out.println(surgeon.is_active);
		System.out.println();
		
		System.out.println(dentist.hasMD);
		dentist.oralCare();
		dentist.education();
		System.out.println(dentist.treats_gum);
		System.out.println();
		
		Doctor doctor = new Doctor(true);
		doctor.setName("Trina");
		Doctor mysurgeon = new Surgeon(true, true); //polymorphism
		mysurgeon.assist();
		System.out.println();
		
		System.out.println(doctor.getName());
		doctor.setId(9387565);
		System.out.println(doctor.getId());
		System.out.println();
		
		Horse horse = new Horse();
		horse.eat();
		horse.sound();
		horse.reproduce();
		horse.warm();
		System.out.println();
		
		Doctor doc1 = new Doctor(true);
		Doctor doc2 = new Doctor(false);
		
		//created array of objects
		Doctor[] docs = {doc1, doc2}; // or new Doctor[3] if no objects initialized, created instead of {}
		//make for loop that iterates through that list, then print out size of array/list
		for(int i = 0; i < docs.length; i++) { // repeats if need to go through lots of arrays
			System.out.println(docs[i]); //prints index 0 and 1
			System.out.println(doc1.hasMD); // prints doc attribute in for loop
		}
		System.out.println(docs.length); // gets size of list outside of for loop
		System.out.println();
		
		//make while loop that does same as for loop
		int i = 0;
		while(i < docs.length) {
			System.out.println(docs[i]); // prints true for index 0 first, then goes to next line, repeats for index 1
			System.out.println(doc1.hasMD); // prints true for all since doc1 is always true
			i++;
		}
		System.out.println(docs.length); // has a length of 2: doc1, doc2
	}

}
