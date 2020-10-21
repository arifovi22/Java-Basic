package codeSolving;

import java.util.Scanner;

public class SumOfTheDigits {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number:");
		int i = scan.nextInt();
		scan.close();
		 int sum = 0;
	        while (i != 0) {
	            sum += 		i % 10;
	            i /= 10;
	            
	        }
	        System.out.println(sum);
		
		
	}

}
