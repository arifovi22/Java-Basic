package basic2;
import java.util.Arrays;

public class Loop {
	

	    private static int[] intArray = new int[]{1, 2,3,4, 5};
	    private static String[] strArray = new String[]{"abc", "bcd", "def", "efg"};
	   
	    public static void main(String args[]) {
	       // System.out.println("Java Example to print int array in Java: " + intArray);
	       // System.out.println("Java Example to print string array in Java: " + strArray);
	     
	        //generic way of printing values of array before java 5      
	        for(int i=0; i< intArray.length; i++){
	            System.out.print(intArray[i] +", ");
	        }
	        
	        for(int i=0; i< strArray.length; i++){
	            System.out.print(strArray[i] +", ");
	        }
	     
	        //printing array values using enhanced for loop java 1.5
	        for(int i : intArray){
	            System.out.print(i +", ");
	        }
	     
	        //another way to print array values in Java 1.4 is using Arrays.asList
	       // System.out.println("Java Example to print String array values in Java 1.4 :"
	        //                    + Arrays.asList(strArray));
	       // System.out.println("Java Example to int array values in Java 1.4 :"
	        //                    + Arrays.asList(intArray));
	     
	        //better way of printing values of array in java 1.5      
	     //   System.out.println("Java Example to print values of array in Java: "
	     //                       + Arrays.toString(intArray));
	     //   System.out.println("Java Example to print values of array in Java: "
	      //                      + Arrays.toString(strArray));
	     
	        int[][] twoDimensionArray = new int[][]{
	                                    {1,2,3},
	                                    {10,20,30},
	                                    {100,200,300},
	                                    };
	                               
	                                    
	        System.out.println("Java Example to print two dimensional array in Java: "
	                            + Arrays.deepToString(twoDimensionArray));

	    }
	}

