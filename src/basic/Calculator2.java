package basic;



import java.util.Scanner;

public class Calculator2 {




public static void main(String[] args) {


		

		//Variables

		double x;

		double y;

		double z;

		String percentage = null; 

		

		//input

	

		Scanner percentageScanner = new Scanner(System.in);

		

		System.out.println("First Number");

		x= percentageScanner.nextDouble();

		

		System.out.println("Enter Perctange Needed");

		y= percentageScanner.nextDouble();

		

		//process

		 z= (x*y)/100;

	

		 //output

	System.out.println(y +" % of " + x );System.out.println("=" + z);;

		

		}
	

	}

   
   
  