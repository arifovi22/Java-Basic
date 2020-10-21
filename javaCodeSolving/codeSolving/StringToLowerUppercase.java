package codeSolving;

import java.util.Scanner;

public class StringToLowerUppercase {
	 public static void main(String[] args){	
	     Scanner in = new Scanner(System.in);
	     System.out.print("Input a String: ");
		 String line = in.nextLine();
		 String line2 = in.nextLine();
		 line = line.toLowerCase();
		 line2 = line.toUpperCase();
		 System.out.println(line + "\n" + line2); 
		 }			

}
