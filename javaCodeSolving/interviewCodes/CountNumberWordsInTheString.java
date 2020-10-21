package interviewCodes;

import java.util.HashMap;

public class CountNumberWordsInTheString {
	
	public static void main(String [] args) {
		String a = "This is test is test";
		String[] b = a.split(" ");
		System.out.println(b.length);
		HashMap<String , Integer> value =new HashMap<String, Integer>();
		
		for (int i = 0; i < b.length; i++) {

			if (value.containsKey(b[i])) {
				int count = value.get(b[i]);
				value.put(b[i], count +1);
				
			}else {
				value.put(b[i], 1);
			}
			
		}
		System.out.println(value);
		
	}
		
		
	}
	
	
	


