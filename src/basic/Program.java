package basic;

import java.util.Scanner;
//Comparing the numbers
public class Program {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int number1;
		int number2;
		
		System.out.println("Input First Number");
		number1 = input.nextInt();
		System.out.println("Input Second Number");
		number2 = input.nextInt();
		
		if (number1 == number2)
		System.out.printf("%d==%d\n", number1, number2);
		if (number1 != number2)
		System.out.printf("%d != %d\n", number1, number2);
		if(number1 <number2 )
		System.out.printf("%d < %d\n",number1, number2);
		if (number1 > number2)
		System.out.printf("%d > %d\n", number1, number2);
		if (number1 <= number2)
		System.out.printf("%d <= %d\n", number1, number2);
		if (number1 >= number2)
		System.out.printf("%d >= %d\n", number1, number2);
		
		
		System.out.println("\nJava Versio:"+System.getProperty("java.version"));
		System.out.println("Java Runtimr Version:"+ System.getProperty("java.runtime.version"));
		System.out.println("Java Home:"+System.getProperty("java.home"));
		System.out.println("Java Vendor:"+System.getProperty("java.vendor"));
		System.out.println("Java vendor URL:"+System.getProperty("java.vendor.url"));
		System.out.println("Java Class Path:"+System.getProperty("java.class.path")+"\n");
		
		
		
	}
	
	
	
	
	
	
	
	

}
