package basic2;

import java.io.File;
import java.io.IOException;

public class CountTheLetter {
	public static void main(String[] args) {
		String input = "The quick brown fox";

		int count = 0;
		for (int i=0; i<input.length(); i++) {
		    if (input.charAt(i) != ' ') {
		        ++count;
		    }
		}
		System.out.println(count);
		
		File file = new File("c:file/");
		
			//checked exception
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
	
		
		
		//Unchecked exception
		int a = 10/0;
		System.out.println(a);
		
		
		
		
		
		
	}

	
}
