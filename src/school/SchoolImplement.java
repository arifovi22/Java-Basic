package school;

import java.util.Scanner;

public abstract class SchoolImplement implements IdeaSchool {
	static int count = 0;
	static int max = 20;
	static int[] sL =new int[max];


	static String[] name = new String[max];
	static String[] adress = new String[max];
	static double[] roll= new double[max];
	static double[] fee = new double[max];
	static int[] id= new int[max];
	static double[] discount = new double[max];
	static double[] netFee = new double[max];	
	static Scanner scan = new Scanner(System.in);

	public static void welcome() {
		System.out.println(" WELCOME TO SOCIAL SCHOOL ");
		System.out.println("   ESTABLISHED ON 1888 ");
		System.out.println("***************************");

	}

	public static void studentName(int array) {
		sL[array] = array+1;
		System.out.println("Please Enter Student Name: ");
		name[array] = scan.nextLine();

	}

	public static void studentRoll(int array) {
		boolean input = true;
		do {
			scan= new Scanner(System.in);
			try {
				System.out.println("Please Enter Student Roll: ");
				roll[array] = scan.nextDouble();
				if (roll[array] >0) {

					input = true;
				}else {
					System.out.println("!!!!** Please enter valid Roll **!!!");
					input =false;
				}
			} catch (Exception e) {
				System.out.println("!!!** Please enter valid input(Number) **!!!");
				input = false;
			}	
		} while (!input);

	}

	public static void adress(int array) {
		System.out.println("Please Enter Student Aderss: ");
		adress[array] = scan.next();

	}

	public static void classFee(int array) {
		boolean input = true;
		do {
			scan = new Scanner(System.in);
			try {
				System.out.println("Please Enter Student Class Fee: ");
				fee[array] = scan.nextDouble();

				if (fee[array]>0) {
					input =true;
				} else {
					System.out.println("!!!** Please Enter Correct Fee **!!! ");
					input= false;
				}	
			} catch (Exception e) {
				System.out.println("!!!** Please Enter Valid Input **!!! ");
			}	
		} while (! input);
	}

	public static void discount(int array) {
		if (fee[array]>=0 && fee[array] <100) {
			discount[array] = -5; 	
		} else if (fee[array]>=100 && fee[array]<200) {
			discount[array] =  -10;
		} else if (fee[array]>=200 && fee[array]<300) {
			discount[array] = -15;
		} else if (fee[array]>=300) {
			System.out.println("Maxmimum discount given: ");
			discount[array] = -20;
		}else {
			fee[array]=0;
			System.out.println("!!!!Invalid Input!!!!");
		}	
	}

	public static void netFee(int array) {
		if (fee[array]>=0 && fee[array] <100) {
			netFee[array] =fee[array] -5; 	
		} else if (fee[array]>=100 && fee[array]<200) {
			netFee[array] = fee[array] -10;
		} else if (fee[array]>=200 && fee[array]<300) {
			netFee[array] = fee[array] - 15;
		} else if (fee[array]>=300) {
			netFee[array] = fee[array]-20;
		}else {
			fee[array]=0;
			System.out.println("!!!!Invalid Input!!!!");
		}

	}

	public static void studentId(int array) {

		boolean input =true;
		do {
			scan = new Scanner(System.in);
			try{
				System.out.println("Please Enter Student ID: ");
				id[array] = scan.nextInt();
				if (id[array]>0) {
					input = true;
				} else {
					System.out.println("!!!** Please Enter Correct ID **!!! ");
					input= false;
				}	
			} catch (Exception e) {
				System.out.println("!!!** Please Enter Valid Input **!!! ");
			}	
		} while (!input);

	}

	public static void display(int array){
		welcome();
		System.out.println("Student Name          : "+name[array]);
		System.out.println("Student Id            : "+id[array]);
		System.out.println("Student Roll          : "+roll[array]);
		System.out.println("Student Adress        : "+adress[array]);
		System.out.println("Student Class Fee     : "+fee[array]);
		System.out.println("Student Discount      : "+discount[array]);
		System.out.println("Student Net Fee       : "+netFee[array]);

	}

	public static void menu() {
		String menu;
		scan = new Scanner(System.in);
		System.out.println("Please Chose an option [(A)Add / (E)Edit / (D)Delete / (X) exit]  :  ");
		menu = scan.nextLine();

		switch (menu) {
		case "A":
			System.out.println(" WELCOME TO SOCIAL SCHOOL ");
			studentName(count);	
			studentId(count);
			studentRoll(count);
			adress(count);
			classFee(count);	
			discount(count);
			netFee(count);
			display(count);
			table(count);
			count++;
			menu();

		}

	}

	public static void editData(int array) {
		scan = new Scanner(System.in);

		System.out.print("Edit By [ SerialNo(S#)  \t" );

		String edit = scan.nextLine();

		switch(edit) {

		case "S#": 

			System.out.println("");

			System.out.print("Enter Serial No to EDIT : \t");

			String sSerialNo = scan.nextLine();

			for(int i=0;i<count;i++) {

				if(sL[i]==Integer.parseInt(sSerialNo) )	{
					System.out.println(" WELCOME TO SOCIAL SCHOOL ");
					studentName(count);	
					studentId(count);
					studentRoll(count);
					adress(count);
					classFee(count);	
					discount(count);
					netFee(count);
					display(count);
					table(count);
					count++;

					break;
				}
			}

			break; // Come Out From Editing 
		default:

			//System.out.println("[ Option Selected " + cMenueSelection + " is not available !!!!]");

			System.out.println( " [" + edit + "] is not a valid Chose correct Action !!!!]" );

			editData(count) ;

		}}






	public static void table(int array) {
		System.out.println("=============================================================================================");
		System.out.println("S#      | STUDENT NAME | STUDENT I.D | STUDENT ADRESS | CLASS FEE | DISCOUNT AMOUNT | NET FEE");
		System.out.println("=============================================================================================");
		for (int i= 0; i < max; i++){
			System.out.println(sL[i] +"  \t|   "+  name[i] +"  \t|    " + adress[i]+"  \t|   " +  id[i] +"  \t|   " + fee[i]+"  \t|   " + discount[i]+"  \t|   " + netFee[i] );
			System.out.println("=============================================================================================");
		}

	}

	public static void main(String [] args) {
		menu();
	}

}
