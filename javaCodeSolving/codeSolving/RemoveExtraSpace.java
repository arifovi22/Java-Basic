package codeSolving;

public class RemoveExtraSpace {
	
	public static void main(String[] args) {
		String a = "I am removing space through coding";
		String[] c =a.split(" ");
		for (int i =0; i< c.length; i++) {
			 a = c[i];
		System.out.print(a);
		}		
	}
}
