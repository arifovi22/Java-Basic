package basic;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class AirlineTIcket {
	static String fName;
	static String lName;
	static String dA;
	static String dD;
	static String fN;
	static String rT;
	static String dT;
	static String aA;
	static String aD;
	static String aT;
	
	static Scanner scan = new Scanner(System.in);
	
 	public static void wellCome() {
		System.out.println("<<<<***WELLCOME TO ARIF & QUAZI VAI VAI AIRLINCE***>>>");
		System.out.println("");
		System.out.println("Please Enter your Information:");
		System.out.println("");
	}
 	public static void dateTime() {
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		 Date date = new Date(System.currentTimeMillis());
		 System.out.println(formatter.format(date));	
	}
	
	public static void input() {
		
		
	
		System.out.println("PLEASE ENTER CUSTOR First NAME:");
		fName = scan.nextLine();
		System.out.println("PLEASE ENTER CUSTOR Last NAME:");
	    lName = scan.nextLine();
		System.out.println("Departed Airport:");
		dA = scan.nextLine();
		System.out.println("Departed Date:");
		dD = scan.nextLine();
		System.out.println("Flight Number:");
		fN = scan.nextLine();
		System.out.println("Departing Time:");
		dT = scan.nextLine();
		System.out.println("Reporting Time:");
		rT = scan.nextLine();
		System.out.println("Arrival Airport:");
		aA = scan.nextLine();
		System.out.println("Arrival Date:");
		aD = scan.nextLine();
		System.out.println("Arrival Time:");
		aT = scan.nextLine();	

		
	}
	
	
	
public static void displayOutPut() {
		
		System.out.println("=================**ARIF & QUAZI VAI VAI AIRLINCE**==================");
		System.out.println("========================****BORDING PASS****========================");
		System.out.println("====================================================================");
		System.out.println("");
		System.out.println("Customer Last Name      :"+ lName+"          "+"Customer First Name  :" + fName);
		System.out.println("Departed Airport        :"+dA);
		System.out.println("Departed Date           :"+ dD);
		System.out.println("Flight Number           :"+ fN);
		System.out.println("Deperting Time          :"+ dT);
		System.out.println("Reporting Time          :"+ rT);
		System.out.println("Arrival Airport         :"+ aA);
		System.out.println("Arrival Date            :"+ aD);
		System.out.println("Arrival Time            :"+ aT);
		System.out.println("=========================******************=========================");
		
	}
	
public static void exit() {
	System.out.println("===========================******************===========================");
	System.out.println("THANK YOU FOR FLYING WITH US=======**********=======HAVE A SAFE LANDING");	
}
	
	
	    public static void main(String args[]) {
	    	
	    	wellCome();
	    	input();
	    	dateTime();
	    	displayOutPut();
	    	exit();
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
			scan.close();
	    	
	    }
	
	
		
		
		
		
		
	}
	
	
	
	
	
	
	


