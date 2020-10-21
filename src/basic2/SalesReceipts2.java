package basic2;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class SalesReceipts2 {	
	static int counter =0;
	static String greetings;
	static String[] customerName = new String[2];
	static String[] productName = new String[2];
	static double[] quantityPurchased = new double [2];
	static double[] priceOfProduct = new double [2];
	static double[] grossPay = new double [2];
	static double[] netPay = new double [2];
  
	public static void table(int arraypoint) {
		System.out.println("=====================================================================================================");
		System.out.println("CUSTOMER NAME | PRODUCT NAME | QUANTITY PURCHASED | PRODUCT PRICE | GROSS AMOUNT PAY | NET AMOUNT PAY");
		System.out.println("=====================================================================================================");
		for(int i =0; i <customerName.length; i++) {
	    System.out.println(customerName[i] +"   |   	  " + productName[i]+"   	  |   	  " + quantityPurchased[i]+"   	  |   	  " + priceOfProduct[i]+"   	  |   	  " + grossPay[i] +"   	  |   	  "+ netPay[i] );	
	    System.out.println("=====================================================================================================");
	    //System.out.println("=====================================================================================================");
		}
	}

	public static void menu() {

		Scanner menuScan = new Scanner(System.in);
		String menu;		
		System.out.println("Please Chose an option [(A)Add / (E)Edit / (D)Delete / (X) exit]  :  ");
		menu = menuScan.nextLine();


		switch(menu) {

		case "A": 
			wellCome(greetings);
			input(counter);
			calculategrossPay(counter);
			calculatenetPay(counter);
			displayOutPut(counter);
			table(counter);
			dateTime(counter);
			exit(counter); 
			counter++;
			menu();



		case "E":
			//Edit
			System.out.println("Editing  Opration .. ");
			menu();  // Recursive Function Call 


		case "D":	
			// Delete
			System.out.println("Deleting  Opration .. ");
			menu();  // Recursive Function Call 


		case "X":	
			// CLose
			System.out.println("Closing  Program See You Soon !!!! .. ");
			System.exit(0); // Exit 


		default : 
			// What the Hell 
			System.out.println("Wrong Option  .. ");
			menu();  // Recursive Function Call 

		}

	}







	////	switch(menu) {
	////	case "A"	





	public static void wellCome(String greetings) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter Owner name    :  ");
		greetings = scan.nextLine();
		System.out.println("<<<<<<<====******WELLCOME TO" +"  "+ greetings+"   " + "STORE******====>>>>>>>");
	
		System.out.println("Please follow the Instruction");
		System.out.println("");
	}

	public static void input(int arraypoint) {
		Scanner myStore = new Scanner(System.in);
		System.out.print("PLEASE ENTER CUSTOR NAME                   :  ");
		customerName[arraypoint] = myStore.nextLine();

		System.out.print("PLEASE ENTER PRODUCT NAME                  :  ");
		productName[arraypoint] = myStore.nextLine();

		boolean doYouWantContiunue;
		do {
			try {
				myStore = new Scanner(System.in);
				System.out.print("Please Enter Quantity                      :  ");
				quantityPurchased[arraypoint] =myStore.nextDouble();
				if(quantityPurchased[arraypoint] > 0){
					//System.out.print("Please Enter Quantity    		 :  ");
					doYouWantContiunue = true;
				} else {
					System.out.print("Please Enter Quantity                  : 1 - up");
					doYouWantContiunue = false;}
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.print("Exception Please Enter valid Input         : ");
				doYouWantContiunue = false;

			}}while (! doYouWantContiunue);

		do {
			try {
				myStore = new Scanner(System.in);
				System.out.print("Please Enter Price                         :  ");
				priceOfProduct[arraypoint] = myStore.nextDouble();
				if (priceOfProduct[arraypoint] > 0) {
				//	System.out.println("");
					doYouWantContiunue = true;
				}else {
					System.out.print("Please Enter Price                     : 1- up");
					doYouWantContiunue = false;}
			}
			catch (Exception e) {
				System.out.print("Exception Please Enter valid Input         :");
				doYouWantContiunue = false;

			}
		}while (! doYouWantContiunue);	
	}

	public static void calculategrossPay(int arraypoint) {
		grossPay[arraypoint] = (quantityPurchased[arraypoint] * priceOfProduct[arraypoint]);

	}

	public static void calculatenetPay(int arraypoint) {
		if (grossPay[arraypoint] >0 && grossPay[arraypoint] <= 100) {
			netPay[arraypoint] = grossPay[arraypoint] -5;
		} else if (grossPay[arraypoint] >100 && grossPay[arraypoint] <=500) {
			netPay[arraypoint] = grossPay[arraypoint] - 10;
		} else if (grossPay[arraypoint] >500 && grossPay[arraypoint] <= 1000) {
			netPay[arraypoint] = grossPay[arraypoint] -20;
		} else if (grossPay[arraypoint] > 1000) {
			netPay[arraypoint] = grossPay[arraypoint] -30;
		}
		else {netPay[arraypoint] = 0;
		System.out.println("ENVILID INPUT");
		}}

//	public static boolean doYouWantContinue(int arraypoint) {
//		String doYouContiunue;
//		Scanner want = new Scanner(System.in);
//		System.out.println("Do you want to continue");
//		System.out.println("Please enter y");
//		doYouContiunue = want.nextLine();
//		if(doYouContiunue.equals("y")) {
//			return true;
//		}
//		return false;
//
//	}		

	public static void dateTime(int arraypoint) {
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		Date date = new Date(System.currentTimeMillis());
		System.out.println(formatter.format(date));	
	}

	public static void displayOutPut(int arraypoint) {

		System.out.println("=======================********MY STORE********========================");
		System.out.println("=====================*******SALES RECEIPTS*******======================");
		System.out.println("==================******NEW YORK TO BANGLADESH******===================");
		System.out.println("");
		System.out.println("=========================*********************=========================");
		System.out.println("CUSTOMER NAME                :  "+ customerName[arraypoint]);
		System.out.println("PRODUCT NAME                 :  "+productName[arraypoint]);
		System.out.println("QUANTITY OF THE PRODUCT      :  "+ quantityPurchased[arraypoint]);
		System.out.println("PRICE                        :  "+ priceOfProduct[arraypoint]);
		System.out.println("GROSS AMOUNT PAY             :  "+ grossPay[arraypoint]);
		System.out.println("NET PAY                      :  "+ netPay[arraypoint]);
		System.out.println("=========================*********************=========================");

	}


	public static void exit(int arraypoint) {
		System.out.println("=========================*********************=========================");
		System.out.println("======================THANK YOU FOR SHOPING TODAY======================");	
	}
}	










