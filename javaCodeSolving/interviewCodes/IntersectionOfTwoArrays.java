package interviewCodes;

public class IntersectionOfTwoArrays {
	
public static void main(String[] args) {
	int[] firstArray = {1,5,6,7,8};
	int [] secondArray= {1,3,6,9,4};

	int c=0;
	
	for (int i = 0; i < firstArray.length; i++) {
		for (int j = 0; j < secondArray.length; j++) {
			if (firstArray[i] == secondArray[j]) {
				c= firstArray[i];
				System.out.println(c);
		}
		
	}
	
		
		
	}
	
			
	
}
}
