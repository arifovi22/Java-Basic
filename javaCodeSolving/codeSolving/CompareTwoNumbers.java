package codeSolving;

import java.util.Scanner;

public class CompareTwoNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your First number:");
		int i = scan.nextInt();
		Scanner scaner = new Scanner(System.in);
		System.out.println("Enter your Second number:");
		int j = scaner.nextInt();
		scan.close();
		scaner.close();
		if (i==j) {
			System.out.printf("%d == %d\n", i,j);
		}if (i<j) {
			System.out.printf("%d < %d\n", i,j);
		}if (i>j) {
			System.out.printf("%d > %d\n", i,j);
		}if (i!=j) {
			System.out.printf("%d != %d\n", i,j);
		}if (i<=j) {
			System.out.printf("%d <= %d\n", i,j);
		}if (i>=j) {
			System.out.printf("%d >= %d\n", i,j);
		}
	}
	}
