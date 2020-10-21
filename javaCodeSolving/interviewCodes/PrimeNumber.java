package interviewCodes;

public class PrimeNumber {
	public static void main(String[] args) {
		int number = 89;
		int temp;
		boolean primeOrNot =true;
		
		for (int i = 2; i < number/2; i++) {
			temp = number%i;
			if (temp == 0) {
				primeOrNot = false;
				break;
			}
			
		}
		if(primeOrNot) 
            System.out.println(number + " number is prime");
            else
                System.out.println(number + " number is not a prime");
             
	}

}
