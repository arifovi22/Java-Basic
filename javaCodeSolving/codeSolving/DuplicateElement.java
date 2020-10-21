package codeSolving;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class DuplicateElement {
	public static void main(String[] args) {
		String elemints[] = { "Java", "c++", "Python", "Rubi", "Javascrept", "Java" };

		//1. Compare each element. Time unit O(n*n)
		for (int i = 0; i < elemints.length; i++) {
			for (int j = i + 1; j < elemints.length; j++) {
				if (elemints[i].equals(elemints[j])) {
					System.out.println("Duplicate value: " + elemints[i]);

				}
			}
		}

		System.out.println("====================================");
		
		//2. HashSet java collection (Its store unique value). Time unit O(n)
		Set<String> elementSet = new HashSet<String>();

		for (String set : elemints) {
			if (elementSet.add(set) == false)
				System.out.println("Duplicate value: " + set);

		}

		System.out.println("====================================");
		
		//3. Using HashMap . Time unit O(2n)
		Map<String, Integer> mapElement = new HashMap<String, Integer>();
		for (String set : elemints) {
		Integer value =	mapElement.get(set);
		if (value == null ) {
			mapElement.put(set, 1);
			
		}else {
			mapElement.put(set, ++value);
		}
		
		//get the value
		Set<Entry<String, Integer>> entrySet = mapElement.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue()>1) {
				System.out.println("Duplicate value: " + entry.getKey());
			}
			
		}
		
		
		
		
			
			
		}
		
		
		
		
		
		
		
		

	}
}