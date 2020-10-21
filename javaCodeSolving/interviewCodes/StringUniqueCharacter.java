package interviewCodes;


public class StringUniqueCharacter {
	
	public static boolean returnCharacter(String a) {
	boolean result = false;
		
			for (char b : a.toCharArray()) {
				if (a.indexOf(b) == a.lastIndexOf(b)) {
					result= true;
					
				}else {
					result =false;
					break;
				}	
			}
			return result;	
	}
	

	
	public static void main(String[] args) {
		System.out.println(returnCharacter("abc klm"));
	}

}
