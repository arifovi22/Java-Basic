package basic;


import java.io.IOException;
import java.util.Scanner;

public class Calculator3 {


public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner (System.in);

System.out.print("First number: ");
double x = Integer.parseInt(scan.nextLine());
System.out.print("Second number: ");
double y = Integer.parseInt(scan.nextLine());
System.out.print("Operator: (+,-,*,/,%) = ");
String op = scan.nextLine();



double z;


 

 
if (op.equals("+")) {
   z = x+y;
} else if (op.equals("-")){
   z = x-y;
} else if (op.equals("*")){
   z = x*y;
} else if (op.equals("/")){
   z  = x/y;
} else if (op.equals ("%")) {

z = (x*y)/100;}
else{
    throw new java.lang.Error("Operator not recognized");
}

System.out.println("=" + z);;

 
    }
}

 
 





