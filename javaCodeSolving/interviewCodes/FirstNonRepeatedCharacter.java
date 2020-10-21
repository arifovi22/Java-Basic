package interviewCodes;



public class FirstNonRepeatedCharacter {

	
public static void main(String[] args) {

	
	String a = "abcanbmc";
	for(char i :a.toCharArray()){
		if(a.indexOf(i)==a.lastIndexOf(i)){
		System.out.println(i);
		break;
		}
	}
		
		for (char b : a.toCharArray()) {
			if (a.indexOf(b)==a.lastIndexOf(b)) {
				System.out.print(b);
				
			}
			
		}
	
}
}

