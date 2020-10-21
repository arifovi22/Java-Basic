package codeSolving;

import scala.Char;

public class StringSplit {
	
	public static void main(String[] args) {
		String s1 ="The cow jumped over the moon";
		int count = 0;
		
		
		
		String[] s2 = s1.split(" ");
	System.out.println(s2.length);

		for (int i = 0; i < s2.length; i++) {
			System.out.println(s2[i]);	
			}
			
		
		for (int i = 0; i < s2.length; i++) {
			if (s1.contains(" ")) {
				count++;
				
			}
			
		}
			System.out.println(count);
			System.out.println("**********************");
		
		String s3 ="The cow jumped over the moon";
		int c = 0;
		String s = " ";
		
		String s4[] = s3.split(" ");
			
		
	for (int i = 0; i < s2.length; i++) {
			if (s4[i].length()> count) {						
		c = s4[i].indexOf(i);
			s = s4[i];
			
			
		}
		}
		System.out.println(s);
		System.out.println(c);
		
		
		
		
		}
		//System.out.println(count);
		
	
		
		
	}


