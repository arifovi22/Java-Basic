 package basic;

public class StaticOverrive extends Override {
	final int k;
	final static int i;
	
	static {
		i=5;
	}
	public StaticOverrive() {
	k=6;
	
	}
	
	public static void name() {
		
		System.out.println("zia");
		
	}
	
	public static void main(String[] args) {
		
		name();
		
		
		
	}
	
	

}
