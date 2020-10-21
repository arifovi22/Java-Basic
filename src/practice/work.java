package practice;

import java.util.Scanner;

public class work {

	public  void patientDetalis() {
		String patientName;
		String adress;
		int patientId;
		double labFee;
		double coPay;
		double discount;
		double grossPay;
		double netPay;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Patient Name    :");
		patientName= scan.nextLine();
		System.out.println("Please Enter Patient Adress  :");
		adress =scan.nextLine();
		System.out.println("Please Enter Patient Patient ID:");
		patientId = scan.nextInt();
		System.out.println("Please Enter Patient Lab Fee:");
		labFee = scan.nextDouble();
		System.out.println("Please Enter Patient Co Pay:");
		coPay =scan.nextDouble();
		
		
		
		
		
	}

	public static void input() {

          work k = new work();
		k.patientDetalis();






	}
public static void main(String [] args) {
	input();
	
	
}

}










