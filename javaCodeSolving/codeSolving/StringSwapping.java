package codeSolving;

public class StringSwapping {
	
	public static void main(String[] args) {
		String a = "String";
		String b = "Swap";
		
		System.out.println("Before Swapping:");
		System.out.println("The value of a:" +a);
		System.out.println("The value of b:" +b);
		
		//casting a and b
		a = a + b;
		
		// storing initial string a in string b
		b = a.substring(0,a.length()-b.length());
		
		// storing initial string b in string a
		a = a.substring(b.length());
		
		System.out.println("After Swapping:");
		System.out.println("The value of a:" +a);
		System.out.println("The value of b:" +b);	
		
	}
	
	
	
	

}
