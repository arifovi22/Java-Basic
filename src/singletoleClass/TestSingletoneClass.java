package singletoleClass;

public class TestSingletoneClass {
	
	public static void main(String [] args) {
		SingleToneClass singleToneClass =SingleToneClass.getInstance();
		System.out.println(singleToneClass.getPassWord());
		
		
	}
	
	

}
