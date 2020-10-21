package interviewCodes;



public class SwapWithoutThirdVariable {
	public static void main(String[] args) {
		int a =12;
		int b =14;
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println(a);
		System.out.println(b);
		
		String c = "no";
		String d = "change";
		String e;
		
		e = c;
		c = d;
		d = e;

		System.out.println(c);
		System.out.println(d);
		
		c = c+d;
		System.out.println(c);
		for (int i = 0; i < c.length(); i++) {
			if (c.contains("change")) {
				c = d;
			} else if (d.contains("no")) {
				d = c;
			}
			System.out.println(c);
			System.out.println(d);
		}
		
		
		
		
		
		
		
		
	}

}
