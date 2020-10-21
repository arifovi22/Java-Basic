package interviewCodes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class IterateUsingWhilefor {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "arif");
		map.put("address", "home");
		
		Iterator<?> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Entry<?, ?> value =  (Entry<?, ?>) it.next();			
			System.out.println("key: "+ value.getKey()+ "\t"+"value :" + value.getValue() );
		}
		
		for (Entry<?, ?> value : map.entrySet()) {
			System.out.println("key: "+ value.getKey()+ "\t"+"value :" + value.getValue());
		}
				
	}

}
