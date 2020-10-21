package codeSolving;


public class ReadLastTwoLetter {
	
	
	public static void main(String[] args) {
		
		String value = "aroz";
		String lastTwo = null;
		if (value != null || value.length() >= 2) {  
		    lastTwo = value.substring(value.length() - 2);
		    System.out.println(lastTwo);
		}
		
		
		String substring = value.substring(Math.max(value.length() - 2, 0));
		System.out.println(substring);
		
		lastTwo = value.substring(value.length()-2);
		
		System.out.println("short : "+lastTwo);
	}
	
	
	
	
	
	

}
