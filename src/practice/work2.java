package practice;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class work2 {
    static int maxArray=15;
	static String[] patientName = new String[maxArray];
	static String[] adress =new String[maxArray];
	static int[] patientId = new int[maxArray];
	static double[] labFee = new double[maxArray];
	static double[] coPay = new double[maxArray];
	static double[] discount = new double[maxArray];
	static double[] grossPay = new double[maxArray];
	static double[] netPay = new double[maxArray];
	static int count;

	public static void input(int array) { 
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Patient Name:");
		patientName[array]= scan.nextLine();
		System.out.println("Please Enter Patient Adress:");
		adress[array] =scan.nextLine();
		boolean doContinue = true;
		do {
			try {
				scan = new Scanner(System.in);
				System.out.println("Please Enter Patient ID:");
				patientId[array] = scan.nextInt();
				if(patientId[array] >0) {
					doContinue = true;
				} else {
					System.out.println("Please Enter Valid Input:");
					doContinue = false;}
			}
			catch(Exception e ) {
				System.out.println(e.getMessage());
				System.out.println("Please Enter Valid Input:");
				doContinue = false;
			}}
		while (! doContinue);

		do {
			try {scan = new Scanner(System.in);
			System.out.println("Please Enter Patient Lab Fee:");
			labFee[array] = scan.nextDouble();
			if (labFee[array] >0) {
				doContinue = true;	
			}else {
				System.out.println("Please Enter Valid Input:");
				doContinue = false;}
			}
			catch(Exception e) 
			{ System.out.println(e.getMessage());
			System.out.println("Please Enter Valid input:");
			doContinue = false;
			}}
		while(! doContinue);

		do {
			try {
				scan = new Scanner(System.in);
				System.out.println("Please Enter Patient Co Pay:");
				coPay[array] =scan.nextDouble();	
				if(coPay[array] > 0) {
					doContinue = true;
				}else {
					System.out.println("Please Enter Valid Input:");
					doContinue = false;
				}}
			catch(Exception e)
			{
				System.out.println("Please Enter Vald Input:");
				doContinue = false;
			}}
		while (!doContinue);
	}

	public static void grossPay(int array) {
		grossPay[array] = labFee[array] + coPay[array];

	}

	public static void calculateNetPay(int array) {
		if(grossPay[array] > 0 && grossPay[array] <= 100) {
			netPay[array] = grossPay[array] -2; 	
		}else if(grossPay[array] >100 && grossPay[array] <= 200) {
			netPay[array] = grossPay[array] -5;
		}else if(grossPay[array] >200 && grossPay[array] <= 300) {
			netPay[array] = grossPay[array] -7;
		}		
	}

	public static void discountPrice(int array) {
		if(grossPay[array] > 0 && grossPay[array] <= 100) {
			discount[array] =  -2; 	
		}else if(grossPay[array] >100 && grossPay[array] <= 200) {
			discount[array] =  -5;
		}else if(grossPay[array] >200 && grossPay[array] <= 300) {
			discount[array] =  -7;
		}		
	}

	public static void menu(){
		String menu;
		Scanner menuScan = new Scanner(System.in);
		System.out.println("Please Chose an option [(A)Add / (E)Edit / (D)Delete / (X) exit]  :  ");
		menu = menuScan.nextLine();

		switch(menu) {
		case "A":
			wellcome();
			input(count);
			grossPay(count);
			discountPrice(count);
			calculateNetPay(count);
			dicplayReceipts(count);
			dateTime(count);
			displayTable(count);
			count++;
			menu();

		case "E":




			menu();

		case "D":




			menu();

		case "X":


			System.out.println("Closing  Program See You Soon !!!! .. ");
			System.exit(0);

		default:




			menu();

		}

	}
	public static void wellcome() {
		System.out.println("===---===----===--- WELLCOME TO LOVE HEALTH PHARMACY---===---===---===");
		System.out.println("===---===---===---===---101, love street, love===---===---===---===---");

	}
	public static void dicplayReceipts(int array) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Patient Name              : "+ patientName[array]);
		System.out.println("Patoent Adress            : "+ adress[array]);
		System.out.println("Patient I.D               : "+ patientId[array]);
		System.out.println("Lab Fee                   : "+ labFee[array]);
		System.out.println("Gross Pay                 : "+ grossPay[array]);
		System.out.println("Discout Amount            : "+ discount[array]);
		System.out.println("Net Pay                   : "+ netPay[array]);	
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	public static void displayTable(int array) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("=============================================================================================");
		System.out.println("PATIENT NAME | PATIENT ADRESS | PATIENT I.D | LAB FEE | GROSS PAY | DISCOUNT AMOUNT | NET PAY");
		System.out.println("=============================================================================================");
		for (int i= 0; i < patientName.length; i++){
		System.out.println(patientName[i] +"  \t|    " + adress[i]+"  \t|   " + patientId[i]+"  \t|   " + labFee[i]+"  \t|   " + grossPay[i] +"  \t|   "+ discount[i]+"  \t|   " + netPay[i] );
		System.out.println("=============================================================================================");
		}
	}

	public static void dateTime(int array) {
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		Date date = new Date(System.currentTimeMillis());
		System.out.println(formatter.format(date));	
	}

	public static void main(String [] args) {
		 menu();
		
	}

}










