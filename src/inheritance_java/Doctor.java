package inheritance_java;

public class Doctor {
	
	private String name;
	
	private int id;
	
	
	boolean hasMD;
	
	Doctor(boolean hasMD){
		this.hasMD = hasMD;
	}
	
	void education() {
		System.out.println("All doctors have gone to their own special educational institute for practice/studies.");
	}
	
	void assist() {
		System.out.println("Every doctor has an assistant");
	}
	
	void tools() {
		System.out.println("This doctor has common tools like a stethoscope");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
