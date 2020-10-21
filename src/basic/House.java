package basic;

import java.util.Scanner;

public class House {
	static String name;
	static double landdValue;
	static double cement;
	static double sand;
	static double labour;
	static double labourHourRate;
	static double mixer;
	static double labourRate;
	static double total;
	
	public static void mixer() {
		mixer = cement * sand;	
	}
	
	public static void labourRate() {
		labourRate =labourHourRate * labour;
		
	}
	
	public static void input() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter Customer Name:");
		name = scan.nextLine();
		System.out.println("Please Enter Land Value:");
		landdValue =scan.nextDouble();
		System.out.println("Please Enter How many bag of Cement:");
		cement =scan.nextDouble();
		System.out.println("Please Enter Pound of Sand:");
	    sand =scan.nextDouble();
		System.out.println("Please Enter Number of labour:");
		labour =scan.nextDouble();
		System.out.println("Please Enter Labour Hour Rate:");
		labourHourRate =scan.nextDouble();
			
		
	}
	public static void total() {
		
		total =(landdValue + mixer + labourRate);
		
		
	}
	
	
	
	
	public static void main( String [] args) {
		input();
		mixer();
		labourRate();
		total();
		System.out.println("!!!!!!!This is my house project!!!!!!!");
		System.out.println("Land           :" + landdValue);
		System.out.println("mixer cost     :" + mixer);
		System.out.println("labour cost    :" + labourRate);
		System.out.println("Total cost     :" + total);
		System.out.println("!!!!!!!This is my house project!!!!!!!");
		
		
		
	}
	
	

}
