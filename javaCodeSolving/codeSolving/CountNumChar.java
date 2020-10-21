package codeSolving;

import java.util.Scanner;

public class CountNumChar {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Sentence:");
		String input = scan.nextLine();
		char[] ch =input.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		scan.close();
		
		for (int i = 0; i < input.length(); i++) {
			if(Character.isLetter(ch[i])){
				letter ++ ;
			}
			else if(Character.isDigit(ch[i])){
				num ++ ;
			}
			else if(Character.isSpaceChar(ch[i])){
				space ++ ;
			}
			else{
				other ++;
			}
		
		}
	
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("other: " + other);
			}
		
		
		
		
		
		
	}
	

