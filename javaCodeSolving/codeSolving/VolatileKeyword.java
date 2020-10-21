package codeSolving;

import java.util.Scanner;

public class VolatileKeyword extends Thread {
	// volatile keyword means it will update the variable value by current value.
	volatile int count = 0;
	boolean counter = true;

	@Override
	public void run() {

		while (counter) {
			System.out.println(count++);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void stopCount() {
		counter = false;
	}

	public static void main(String[] args) {
		VolatileKeyword key = new VolatileKeyword();
		key.start();
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		key.stopCount();
	}

}
