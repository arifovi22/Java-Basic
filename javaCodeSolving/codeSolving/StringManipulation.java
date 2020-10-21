package codeSolving;

public class StringManipulation {
	
	
	public static void main(String[] args) {
		String str = "Its so cold and snow";
		
		//get the length of the String 
		System.out.println(str.length());
		
		//get the index of the character from the string
		System.out.println(str.indexOf("s"));
		
		
		//get the character from the string
		System.out.println(str.charAt(4));
		
		//get the second character from the string
		System.out.println(str.indexOf("s", str.indexOf("s")+1));
		System.out.println(str.lastIndexOf("s"));
		
		//get the word from the string
		System.out.println(str.indexOf("so"));
		System.out.println(str.indexOf("cold"));
		
		//string comparison
		String firstValue = "I am learning String";
		String secondValue = "I am learning String";
		String thirdValue = "I am learning STRING";
		
		System.out.println(firstValue.equals(secondValue));
		System.out.println(secondValue.equalsIgnoreCase(thirdValue));
		
		//substring(get small string from big string
		System.out.println(firstValue.substring(5, 12));
		
		//trim(it will remove space from beginning and the end
		String useTrim = "   HI I AM USING TRIM   ";
		System.out.println(useTrim.trim());
		
		//replace
		String date = "01/18/2020";
		System.out.println("Original String: "+ date + " ||| " + "After replace: " +date.replace("/", "-"));
		
		//Split 
		String split = "I_AM_TRY_SPLIT";
		String[] storingSplit = split.split("_");
		for (int i = 0; i < storingSplit.length; i++) {
			System.out.println(storingSplit[i]);	
		}
		
		//concat
		System.out.println(date.concat("year"));
		
		//Understanding String print
		
		String a = "Hello";
		String b = "World";
		int c = 100;
		int d = 200;
		System.out.println(a+b+c+d);
		System.out.println(c+d+a+b);
		System.out.println(c+a+d+b);
		System.out.println(a+b+(c+d));
		
			
		
	}
	
	
	
	
	

}
