package codeSolving;

import java.util.Scanner;

public class OddOrEven {
    static boolean doYouWantContiunue;
	public static void oddOrEven() {
		
		do {	
		try {
				int x;
				System.out.println("Enter an integer to check if it is odd or even");	
				Scanner itn = new Scanner(System.in);
				x = itn.nextInt();
				if (x % 2 == 0)
					System.out.println("The number is even.");
				else
					System.out.println("The number is odd.");
		
		
		for (int i = 0; i < 10; i++) {
				
		}} catch (Exception e) {
			System.out.println("please Enter Number: ");
			doYouWantContiunue= false;
		}}while(! doYouWantContiunue);
		}
	

	public static void main(String args[]){
		oddOrEven();
	}
}









