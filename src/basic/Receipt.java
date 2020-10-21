package basic;
import java.util.Scanner;

public class Receipt {
	
	//Variables Declaration 
			static String nameOfInvoice;
			static String nameOfCustomer;
			static String nameOfProduct;
			static double quantiltyPurched;
			static double priceOfProduct;
			static double grossAmountToPay;
			static double netAmountToPay;
			
			
			
			
			
			public static void nameInvoice() {
				System.out.println("PLUMBING SERVICE");
				System.out.println("");
				System.out.println("123 Abc Street");
				System.out.println("Brooklyn, NY 11218");
				System.out.println("******************");
				
				System.out.println("");
				System.out.println("");
				
			}
			
			
			public static void nameOfCustomer() {
				Scanner Nameinput = new Scanner (System.in);
				System.out.println("Please Enter Your Name: ");
				nameOfCustomer = Nameinput.nextLine();
				
			}
			
			
			public static void nameOfProduct() {
				
				Scanner productname = new Scanner (System.in);
				
				System.out.println("Enter Product Name: ");
				nameOfProduct = productname.nextLine();
			}
			
			public static void quantiltyPurched() {
				Scanner productTotal= new Scanner (System.in);
				System.out.println("Enter Product quantity: ");
				quantiltyPurched = productTotal.nextDouble();
				
			}
			public static void priceOfProduct() {
				Scanner price= new Scanner (System.in);
				System.out.println("Enter Product Price: ");
				priceOfProduct = price.nextDouble();
				
			}
		
			
			public static void grossAmountPay() {
				grossAmountToPay = quantiltyPurched * priceOfProduct;
				
			
				
			}
			public static void netAmountPay() {
				
				//NetPay not Working for some reason
				if(grossAmountToPay>100) {
					netAmountToPay = grossAmountToPay - 5;
					
				} else if (grossAmountToPay>101 && grossAmountToPay<=500) {
					netAmountToPay = grossAmountToPay - 10;
					
				} else if (grossAmountToPay>501 && grossAmountToPay<=1000) {
					netAmountToPay = grossAmountToPay - 20;
					
				}	else if (grossAmountToPay>1001) {
						netAmountToPay = grossAmountToPay -30;
					}
				
				else {
					netAmountToPay=0;
					System.out.println("Invalid Input");
				}
			}
			
			public static void displayOutPut() {
				
				
				// invoice name showing null
				System.out.println("-----------------------------------");
				System.out.println("");
				
				System.out.println("Customer Name is: " + nameOfCustomer);
				
				System.out.println("Product Name is: " + nameOfProduct);
				
				System.out.println("Product Quantity is: " + quantiltyPurched);
				
				System.out.println("Product price is: " + priceOfProduct);
				
				System.out.println("Gross Amount is: " + grossAmountToPay);
				
				System.out.println("------------------------------------");
				
				System.out.println("Net Amount Due: " + netAmountToPay);
				
				System.out.println("");
				
				System.out.println("");
			}

	public static void main(String[] args) {
		
		nameInvoice();
		nameOfCustomer();
		nameOfProduct();
		quantiltyPurched();
		priceOfProduct();
		grossAmountPay();
		netAmountPay();	
		
		displayOutPut();
		
		
		
		
		for(int i=0; i<9;i++) {
			
			System.out.println("Invoice: " + (i+1));
			
	
	String DoYouWantToContinue;
	Scanner cnt= new Scanner (System.in);
	
	System.out.println("Do you Want to Continue ? Type Yes or No");	
	DoYouWantToContinue =cnt.nextLine();
	
	
	if (DoYouWantToContinue.contentEquals("no")) {
		break;
	}
}
			

	}

}
