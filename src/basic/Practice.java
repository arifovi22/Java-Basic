package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
	 final int a;
	 
	 static final int b;

	public static void main(String[] args) {
	
		arrayTo();
		
		//fibonacci();
		//palindromeT();
		//System.out.println(anagram("abcd", "dbac"));
		//System.out.println(palindrome("mom"));
		
	}
	
	public Practice() {
     a=5;
	}

	static {
		b=5;
	}
	
	public static void fibonacci() {
		
	
		int i =50;
		int j =0;
		int k=1 ;

        System.out.print("Upto " + i + ": ");
		
		for (int l = 1; l <= i; ++l) {
			// while (j <= i) {
			System.out.print(j+ "+");
			int sum = j+k;
			j = k;
			k=sum;
		}}
		
		public static void arrayTest() {
			int[] i = new int[5];
			i[0]= 'a';
			System.out.println(i[0]);
			
		}
		
		public static boolean anagram(String a, String b) {
			if (a.length() != b.length()) 
				return false;
			
			
			char[] c = a.toCharArray();
			Arrays.sort(c);
			char[] d = b.toCharArray();
			Arrays.sort(d);
			for (int i = 0; i < c.length; i++) 
			if (c[i]!=d[i]) 
				return false;
				
			
			
			return true;
			
		}
		
		public static boolean palindrome(String a) {
			String b = a.toLowerCase();
			int length = b.length();
			int c =0, d= length-1;
			while (c<d) {
			char e =	b.charAt(c++);
				char f = b.charAt(d--);
				if (e != f) {
					return false;
					
				}
				
				
			}
			return true;
			
			
			
			
		}
		
		public static void palindromeT() {
			String a ="DaD";
			String b ="";
			
		for (int i = a.length()-1; i >= 0; i--) 
			b = b+a.charAt(i);
			if (a.equals(b)) 
				System.out.println("This is palindrome");
				
			else 
				System.out.println("Not Palindrome");
			
			
		}
		
		
		
		public static void arrayTo() {
			System.out.println("Test");
			int[] a = {12,33,44,12,18,16,15};
			int p = 0;
			int q=0;
			
			
			
			for(int i= a.length-1; i>=(a.length)-1; i--) {
				//while (b<a.length-(a.length)) {
					p = a[i];
					for(int j= a.length-1; j>=(a.length)-2; j--) {
						q = a[j];
					}
		
			
			}
			int multi=p*q;
			int mm = multi;
			int last;
			
		
			System.out.println(multi);
				
				
				last = multi%100;
			System.out.println(last);
				//last = String.valueOf(mm).substring(2);
			System.out.println(String.valueOf(multi).substring(1, 3));
			System.out.println("This");
					
			
			
			int k= 1234;
			System.out.println(String.valueOf(k).substring(2));
			
			Scanner scanner=  new Scanner(System.in);
			System.out.println("enter the number ");
			int o = scanner.nextInt();
			int dig = o%100;
			System.out.println(dig);
			
			
			
		}
			
			
			
			
		}
		
	
	
	
	
	
	

