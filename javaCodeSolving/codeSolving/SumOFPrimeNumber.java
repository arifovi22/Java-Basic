package codeSolving;

public class SumOFPrimeNumber {
	public static boolean isPrime(int number) {

		for (int i = 3; i * i <= number; i += 2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int sum = 1;
		int ctr = 0;
		int n = 0;

		while (ctr < 100) {
			n++;
			if (n % 2 != 0) {
				// check if the number is even
				if (isPrime(n)) {
					sum += n;
				}
			}
			ctr++;
		}
		System.out.println("\nSum of the prime numbers till 100: " + sum);
	}

}
