package constractor;

public class UseConstractor {
	/**
	 * Constructor:
	 * Default Constructor
	 * Parameterized Constructor
	 * 
	 * Constructor has no return type
	 * A constructor can be used to initialize an object
	 * A constructor is incoked when a object is creeated using the keyword new.
	 * A constructor name must be same as the name of the class.
	 * 
	 * A constructor in java is a block of code similar to a method thats called
	 * when an instance of object is created. Here are the key defference
	 * 
	 * 
	 * 
	 * 
	 */
	public UseConstractor() {
		
	}
	
public UseConstractor(String name) {
		System.out.println(name);
		
	}
	
public UseConstractor(String name, String adress) {
	
	System.out.println(name);
	System.out.println(adress);
}
public UseConstractor(String name, String adress, int roll) {
	System.out.println(name);
	System.out.println(adress);
	System.out.println(roll);
}
	
	
	

}
