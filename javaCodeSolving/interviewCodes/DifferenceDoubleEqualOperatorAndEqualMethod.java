package interviewCodes;

public class DifferenceDoubleEqualOperatorAndEqualMethod {
	public static void main(String[] args) {
		String a = new String("Difference"); 
		String b = new String("Difference"); 
		
		// == operators referring to reference / address (compression)
		System.out.println(a==b);
		
		// equals method referring to contains (compression)
		System.out.println(a.equals(b));
		
	}
	
	

}
