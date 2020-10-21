package basic;

public class LargestAndSmallestNumber {
	public static void main(String[] args) {
		int[] a = { 10, 12, 55, 67, 68, 9, 11, 69, 4 };
		int smallest = a[0];
		int largest = a[0];

		for (int i = 0; i < a.length; i++) {
			if (smallest > a[i]) {
				smallest = a[i];
			}
			if (largest < a[i]) {
				largest = a[i];
			}
		}
		System.out.println(smallest);
		System.out.println(largest);
	}

}
