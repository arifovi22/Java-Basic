package codeSolving;

import java.util.Scanner;

public class CheckEvenOrOdd {
	
	static boolean doYouWantContiunue;

	public static void oddOrEven() {

		do {
			try {
				int x;
				System.out.println("Enter an integer to check if it is odd or even");
				Scanner itn = new Scanner(System.in);
				x = itn.nextInt();
				if (x % 2 == 0)
					System.out.println("The number is even."+"1");
				else
					System.out.println("The number is odd."+"0");

				for (int i = 0; i < 10; i++) {

				}
			} catch (Exception e) {
				System.out.println("please Enter Number: ");
				doYouWantContiunue = false;
			}
		} while (!doYouWantContiunue);
	}
	
	
	 public static void simple(){
		 Scanner in = new Scanner(System.in);
		 System.out.print("Input a number: ");
	     int n = in.nextInt(); 
	            if (n % 2 == 0) {
	                System.out.println(1); 
	               }
				else {
	                System.out.println(0); 
	              }
	     }
	

	public static void main(String args[]) {
	//	oddOrEven();
		simple();
	}
}
