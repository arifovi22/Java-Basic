package interviewCodes;

import java.util.ArrayList;





public class ArmstrongNumber {
	
	

	public static void main(String[] args) {
		getArmstrongNumber(22, 11, 8);

		System.out.println("\\s");
	}
	
	
	
	
	public static void getArmstrongNumber(int a, int b, int c) {
		ArrayList<Integer> d= new ArrayList<Integer>(); 
			d.add(a);
			d.add(b);
			d.add(c);
			for (int i = 0; i < d.size();) {
				a= a*(a*d.get(i));
				System.out.println(d.get(i));
				System.out.println("*******");
				break;
				
			}
					for (int j = 1; j < d.size();) {
						b= (b*b)*d.get(j);
						System.out.println(d.get(j));
						System.out.println("*******");
						break;
					
					}
					
					for (int k = 2; k < d.size();) {
						c= (c*c)*d.get(k);
						
						
						System.out.println(d.get(k));
						System.out.println("*******");
						break;
						
					}
				
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			int armstrongNumber = a+b+c;
			System.out.println(armstrongNumber);
		
			
			
		}
		

}
