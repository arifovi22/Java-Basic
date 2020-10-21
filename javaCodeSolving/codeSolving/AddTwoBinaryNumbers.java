package codeSolving;

import java.util.Scanner;

public class AddTwoBinaryNumbers {
	public static void intToBinary() {

		int a = 10;
		int b = 11;
		System.out.println("Binary of 10 = " + Integer.toBinaryString(a));
		System.out.println("Binary of 11 = " + Integer.toBinaryString(b));
		System.out.println("Sum of two Binary numbers = " + Integer.toBinaryString(a) + Integer.toBinaryString(b));

	}

	public static void general() {
		long binary1, binary2;
		int i = 0, remainder = 0;
		int[] sum = new int[20];
		Scanner in = new Scanner(System.in);

		System.out.print("Input first binary number: ");
		binary1 = in.nextLong();
		System.out.print("Input second binary number: ");
		binary2 = in.nextLong();

		while (binary1 != 0 || binary2 != 0) {
			sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + remainder) % 2);
			remainder = (int) ((binary1 % 10 + binary2 % 10 + remainder) / 2);
			binary1 = binary1 / 10;
			binary2 = binary2 / 10;
		}
		if (remainder != 0) {
			sum[i++] = remainder;
		}
		--i;
		System.out.print("Sum of two binary numbers: ");
		while (i >= 0) {
			System.out.print(sum[i--]);
		}
		System.out.print("\n");

		in.close();
	}

	public static void main(String[] args) {

		intToBinary();
		// general();

	}

}
