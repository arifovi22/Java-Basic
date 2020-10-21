package basic;

import java.util.Arrays;

public class FindCommonWords {

	public static void main(String[] args) {
		String a = "I am writing a common common word";
		String[] b = a.split(" ");
		String c = null;
		Arrays.sort(b);
		for (int i = 0; i < b.length; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i].equals(b[j])) {
					c = b[i];
				}
			}
		}
		System.out.println(c);
	}

}
