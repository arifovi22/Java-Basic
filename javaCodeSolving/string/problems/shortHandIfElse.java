package string.problems;



public class shortHandIfElse {

	/*
	 * There is also a short-hand if else, which is known as the ternary operator
	 * because it consists of three operands. It can be used to replace multiple
	 * lines of code with a single line. It is often used to replace simple if else
	 * statements:
	 */
	
	public static void main(String[] args) {
		String variable;
		String expression = "no";
	
	
	variable = (expression == "yes") ? "expressionTrue" :  "expressionFalse";
	System.out.println(variable);
	variable = (expression.contains("yes")) ? "expressionTrue" :  "expressionFalse";
	System.out.println(variable);
	variable = (expression != "yes") ? "expressionTrue" :  "expressionFalse";
	System.out.println(variable);
	variable = (expression.equals("yes")) ? "expressionTrue" :  "expressionFalse";
	System.out.println(variable);
	variable = (expression=="yes") ? "expressionTrue" :  "expressionFalse";
	System.out.println(variable);
	
	
	
	
	
	int time = 20;
	String result = (time < 17) ? "Good day." : "Good evening.";
	
	System.out.println(result);
	
	
	

	
	int[] j = {22,14,16,19,5,10,8};
	int lowest =j[0] ;
	int highest = j[0];
	for (int i = 0; i < j.length-1; i++) {
		if(j[i]>highest) {
			highest =j[i];
			
		}else if (j[i]<lowest) {
				
				lowest=j[i];
			}
			
			
		
		
		
	}
	
	
	System.out.println(highest);
	System.out.println(lowest);
	
	int i = 1;
	int k = i++;
	System.out.println(i);
	System.out.println(k);
	
	System.out.println(k);
	System.out.println(i);
	
	
	
	
	
	
	}
}
