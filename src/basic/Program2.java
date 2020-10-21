package basic;

import java.util.Scanner;
//Checking How many character is written
public class Program2 {
	public static void main(String [] args) {
		String test= "Aa Kiu, I kjnndkndkm 123 kd.j3 6n djdn nc.ci";
		count(test);
		}
		
	public static void  count(String x) {
		char[] ch=x.toCharArray();
		int letter =0;
		int space = 0;
		int num = 0;
		int other =0;
		for(int i = 0; i < x.length();i++) {
			if (Character.isLetter(ch[i])) {
				letter ++;}
				else if ((Character.isSpaceChar(ch[i]))){
					space ++;
			}
				else if ((Character.isDigit(ch[i]))){
					num ++;
				}
				else {
					other ++;
				}	
		}
		
		System.out.println("Aa Kiu, I kjnndkndkm 123 kd.j3 6n djdn nc.ci");
		System.out.println("Letter:"+ letter);
		System.out.println("Space:"+ space);
		System.out.println("Number:"+ num);
		System.out.println("Other:"+ other);
		
	}	
		
	
	
	
	
	
	}
	
	
	
	
	
	
	
	


