package codeSolving;

import java.util.Scanner;

public class ComputesTheValueOfN {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter any number: ");
		int n = scanner.nextInt();
		scanner.close();
		
		System.out.println("Output: "+n+"+"+n+n+"+"+n+n+n);
		 System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);

}
}