package inheritance_java;


public class Horse implements Animal, LivingBeing {
	
	@Override
	public void sound() { //has to have access modifier
		System.out.println("The horse goes neigh");
	}
	
	@Override
	public void eat() {
		System.out.println("The horse eats hay");
	}

	@Override
	public void warm() {
		System.out.println("The horse has a warm body");
		
	}

	@Override
	public void reproduce() {
		System.out.println("The horse can reproduce");
	
	}

}
