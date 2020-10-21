package codeSolving;

import java.util.Scanner;

public class CalculateTheModulesOfTwoNumbers {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the first number :");
		int number1 = scanner.nextInt();
		System.out.print("Please enter the second number :");
		int number2 = scanner.nextInt();
		int devided = number1/number2;
		int result = number1 - (devided * number2);
		System.out.println("The result is : " + result);
		scanner.close();
		
		
		
		
		
		
		
	}
	
	
	
	

}
