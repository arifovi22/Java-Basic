package basic;
public class Variables{
	//non static method-void
	public void getadress() {
		System.out.println("my adress is...");
	}
	
	//static method- void
	public static void gettime() {
		System.out.println("current time is...");
		}
	//non static method- return type
	public int calculator(int a, int b) {
		int total= a+b;
		//System.out.println(total);
		return total;
	}
	//static method- return type
	public static int calculator1(int a, int b) {
		int total= a - b;
		return total;
	}
	
	
	
	
	
	
	
	
	
}
