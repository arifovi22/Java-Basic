package singletoleClass;


public class SingleToneClass{
	
	private static String passWord ="Secrect Password";
	private static SingleToneClass singleToneClass = null;
	
	private SingleToneClass() {
		
	}
	
	public static SingleToneClass getInstance() {
		
		if (singleToneClass == null) {
			singleToneClass = new SingleToneClass();
			
		}	
		return singleToneClass;	
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		SingleToneClass.passWord = passWord;
	}
	
	
		
		
		
	}