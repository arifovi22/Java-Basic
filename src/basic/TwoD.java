package basic;

public class TwoD {
	public static void main(String[] args) {
		String[][] a =new String[2][4];
		a[0][0]= "hi";
		a[0][1] ="my";
		a[0][2]= "its";
		a[0][3] ="working";
		
		
		a[1][0]= "hi";
		a[1][1] ="my";
		a[1][2]= "its";
		a[1][3] ="working";
		
		for (int j = 0; j < a.length; j++) {
		for (int i = 0; i < a.length; i++) {
			
				
			
			System.out.println(a[j][i]);
			
	}
		}
		System.out.println("**************");
		
		System.out.println(a[0][1]);
	}

}
