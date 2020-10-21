package basic;

public class SwitchCase {
	public static void main(String[] args) {
		
		String name = "aaaa";
		String name1 = "bbbb";
		
	String a=	name.substring(0, name.length());
	System.out.println(a);
	
		switch (name1) {
		case "aaaa":
			System.out.println("i am no 1");
			
			break;
		case "bbbb":
			System.out.println("i am no 2");
			break;

		default:
			break;
			
				
			
		}
		System.out.println("++++++++++++");
		
		String aa = "jjja";
		String b = aa;
		System.out.println("first:"+ aa);
		System.out.println("first:"+b);
		
		b="hhh";
		aa="iii";
		System.out.println(b);
		System.out.println(aa);
		
		
		System.out.println("++++++++++++");
	
		String i ="aaaa";
		String j = "aaaa";
		String k =new String("aaaa");
		k=j;
		
		
		
		System.out.println(i.equals(j));
		System.out.println(j.equals(k));
		System.out.println(i.equals(k));
		System.out.println(i==j);
		System.out.println(j==k);
		System.out.println(i==k);
		
		
		
		
		
		
		
		
	}

}
