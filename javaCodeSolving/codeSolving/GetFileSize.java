package codeSolving;

import java.io.File;

public class GetFileSize {
	

	public static void main(String[] args) {
	String pathFile = "C:\\Users\\Arif\\Desktop\\Inverview Java code.docx";

	File file = new File(pathFile);
	if(file.exists()){
	System.out.println(file.getAbsolutePath()+ " : " + file.length());
	}
	}
	}
