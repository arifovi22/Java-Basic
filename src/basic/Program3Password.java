package basic;

import java.io.Console;

public class Program3Password {
	

	public static void main(String [] args) {
	Console cons;
	if((cons = System.console()) != null)
	{
		char[] pass_word = null;
		try
		{
			pass_word = cons.readPassword("Input your password:");
			System.out.println("Your Password was:"+ new String(pass_word));
			
		}
		finally {
			if(pass_word != null)
			{
				java.util.Arrays.fill(pass_word,' ');
			}
		}
		}
		else {
			throw new RuntimeException("Cant get password....No console");
		}
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	


