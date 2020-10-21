package create;

import java.io.File;

public class CreateNewFile {
	
	
	
	
	
	
	

	public static void main(String[] args) {
		File flFile= new File("C:\\Users\\Arif\\Desktop\\Arif");
		//or ("C:/Users/Arif/Desktop/Arif");
		flFile.mkdir();

		String directoryLocationString = flFile.getAbsolutePath();
		System.out.println(directoryLocationString);


		try {
			File fl= new File("C:/Users/Arif/Desktop/Arif/new.txt");
			fl.createNewFile();
			
		} catch (Exception e) {
			System.out.println("Exception"+e);
		}




	}




}
