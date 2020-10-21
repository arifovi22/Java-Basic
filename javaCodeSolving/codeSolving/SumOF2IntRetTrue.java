package codeSolving;

import java.util.Scanner;

public class SumOF2IntRetTrue {
	
	public static void test1() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the first number :");
		int a=sc.nextInt();
		System.out.println("Input the second number :");
		int b=sc.nextInt();
		System.out.println("Input the third number :");
		int c=sc.nextInt();
		int sum=a+b;
		boolean d=c==sum?true:false;
		System.out.println("The result is: "+d) ;

		}
		
	public static void test2() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the first number : ");
		int x = in.nextInt();
		System.out.print("Input the second number: ");
		int y = in.nextInt();
		System.out.print("Input the third number : ");
		int z = in.nextInt();
		System.out.print("The result is: " + sumoftwo(x, y, z));
		System.out.print("\n");
	}

	public static boolean sumoftwo(int p, int q, int r) {
		return ((p + q) == r || (q + r) == p || (r + p) == q);
	}
	
	
	public static void main(String[] args) {
		//test1();
		test2();
	}
	
	
	
	

}
