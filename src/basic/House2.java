package basic;


public class House2 {
	static String max;
	
	public static void main (String [] args) {  
		variable var = new variable();
		max =var.name;
		variable varw = new variable();
		
		sam();
		
		
	}
	
	public static void sam() {
		
	variable var = new variable();
	
	var.name =  "Sam";
	var.className= "class one";
	var.rollNo =2;
	var.idNo =120;
	var.marks =90;	
	System.out.println(var.name+" " +var.className+" "+ var.idNo+" "+ var.rollNo+" " +var.marks);
	}
	
	public static void ram() {
		
		variable varw = new variable();
		
		varw.name =  "Ram";
		varw.className= "class one";
		varw.rollNo =4;
		varw.idNo =124;
		varw.marks =89;	
		
		}

}


 class variable{
	String name;
	String className;
    double rollNo;
    double idNo;
    double marks;
    	 
	 
	  
 }


  