package basic;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class SalesReceipts2 {
	static String customerName;
	static String productName;
	static double quantityPurchased;
	static double priceOfProduct;
	static double grossPay;
	static double discountGiven;
	static double taxPay;
	static double netPay;
	
	
	
 	public static void wellCome() {
		System.out.println("<<<<***WELLCOME TO MY STORE***>>>");
		System.out.println("Please follow the Instruction");
		System.out.println("");
		System.out.println("");
	}
	
	public static void input() {
		Scanner myStore = new Scanner(System.in);
		System.out.println("PLEASE ENTER CUSTOR NAME:");
		customerName = myStore.nextLine();
		System.out.println("PLEASE ENTER PRODUCT NAME:");
		productName = myStore.nextLine();
		System.out.println("Quantity Purchased:");
		quantityPurchased =myStore.nextDouble();
		System.out.println("Price:");
		priceOfProduct = myStore.nextDouble();		
		
	}
	
	public static void calculategrossPay() {
		grossPay = quantityPurchased * priceOfProduct;
	
	}
	
	public static void calculateDiscount() {
		if (grossPay >0 && grossPay <= 100) {
			discountGiven = -5;
		} else if (grossPay >100 && grossPay <=500) {
			discountGiven =  - 10;
		} else if (grossPay >500 && grossPay <= 1000) {
			discountGiven =  -20;
		} else if (grossPay > 1000) {
			discountGiven = -30;
		}
		else {netPay = 0;
		System.out.println("ENVILID INPUT");
		}
		}
	
	public static void calculateTaxPay() {
		
	taxPay = ((grossPay*8.75)/100);
	}
	
	public static void calculatenetPay() {
		if (grossPay >0 && grossPay <= 100) {
			netPay = grossPay-5;
		} else if (grossPay >100 && grossPay <=500) {
			netPay =grossPay-10;
		} else if (grossPay >500 && grossPay <= 1000) {
			netPay =grossPay -20;
		} else if (grossPay > 1000) {
			netPay = grossPay-30;
		}
		else {netPay = 0;
		System.out.println("ENVILID INPUT");
		}}
	
	public static void dateTime() {
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		 Date date = new Date(System.currentTimeMillis());
		 System.out.println(formatter.format(date));	
	}
	
	public static void displayOutPut() {
		
		System.out.println("=================**MY STORE**==================");
		System.out.println("==============**SALES RECEIPTS**===============");
		System.out.println("==========**NEW YORK TO BANGLADESH**===========");
		System.out.println("");
		System.out.println("===================*********===================");
		System.out.println("CUSTOMER NAME          :"+ customerName);
		System.out.println("PRODUCT NAME           :"+productName);
		System.out.println("QUANTITY OF THE PRODUCT:"+ quantityPurchased);
		System.out.println("PRICE                  :"+ priceOfProduct);
		System.out.println("GROSS AMOUNT PAY       :"+ grossPay);
		System.out.println("Tax Payabl             :"+ taxPay);
		System.out.println("Given Discount         :"+ discountGiven);
		System.out.println("NET PAY                :"+ (netPay+taxPay));
		System.out.println("===================*********===================");
		
	}
	
	
	public static void exit() {
		System.out.println("===================*********===================");
		System.out.println("THANK YOU FOR SHOPING TODAY");	
	}
	
	public static void main(String [] args) {
		   wellCome();
		for(int i =0; i <10; i++) {
			System.out.println("SALES:" + (i+1)+">>>>>>");
			input();
			calculategrossPay();
			calculatenetPay();
			calculateTaxPay();
			calculateDiscount();
			displayOutPut();
			dateTime();
			exit();
			
	String doYouWantContiunue;
	Scanner want = new Scanner(System.in);
	System.out.println("Do you want to continue");
	System.out.println("Please enter n");
	doYouWantContiunue = want.nextLine();
	if(doYouWantContiunue.equals("n")) {
		break;
	}		
			
		}
	
	}
	
	}
	

