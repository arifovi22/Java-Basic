package basic;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class MySchool {
	static String firstName;
	static String lastName;
	static int studentId;
	static double tutionFee;
	static double discount;
	static double netFee;
	static Scanner scan;
	static Scanner scanner;
	
	public static void wellcome() {
		System.out.println("------Wellcome to MY SCHOOL------");
		System.out.println("");
		System.out.println("Please follow the process:");
	}
		
	public static void input() {
		scan = new Scanner(System.in);
		
		System.out.println("Enter Student's First Name:");
		firstName = scan.nextLine();
		System.out.println("Enter Student's Last Name:");
		lastName= scan.nextLine();
		System.out.println("Enter Student's ID:");
		studentId = scan.nextInt();
		System.out.println("Enter the tution fee:");
		tutionFee =scan.nextDouble();
	
 	} 
	
	public static void calculateDiscount() {
		if (tutionFee>0 && tutionFee <100){netFee= tutionFee -(tutionFee*5)/100;}
	    else if (tutionFee>=100 && tutionFee <200){netFee= tutionFee -(tutionFee*10)/100;}
		else if(tutionFee>=200 &&tutionFee <300) {netFee= tutionFee - (tutionFee*15)/100;}
		else if(tutionFee>300) {netFee= tutionFee - (tutionFee*15)/100;}
		else {netFee= 0;
	    System.out.println("Please verefy the Input");}
	}
	
	public static void display() {
		System.out.println("Discounted Price:" + tutionFee);
		System.out.println("Net Fee:"+ netFee);	
	}
	
	public static void dateTime() {
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		 Date date = new Date(System.currentTimeMillis());
		 System.out.println(formatter.format(date));
		
		
		
	}
		
	public static void main(String[]args){
		wellcome();
		for(int i =0; i <10; i++) {
			System.out.println("REGISTRATION:" + (i+1)+">>>>>>");
		input();
		calculateDiscount();
		display();
		dateTime();
		System.out.println("THANK YOU TO REGISTER");

		String continuation;
		
		System.out.println("Do you want to Continue");
		System.out.println("Please put n");
		scanner = new Scanner(System.in);
		continuation = scanner.nextLine();
		if(continuation.equals ("n")) {
		 break;	
		
		}}}
		}
	
	