package codeSolving;



public class HighestAndLowestNumber {
	public static void main(String[] args) {
		int j[]= {12,34,12,33,38};
		int k = j[0],l = j[0];
		for (int i = 0; i < j.length;i++) {		
			if(k>j[i]) {
				k=j[i];	
			}
			if(l<j[i]) {
				l=j[i];

			}
		}
		System.out.println("Lowest Number:\t"+k);
		System.out.println("Highest Number:\t"+l);

	}

}
