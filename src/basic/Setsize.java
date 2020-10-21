package basic;

import java.util.HashSet;
import java.util.Iterator;

public class Setsize {
	String name;
	String roll;
	
	public Setsize(String name, String roll) {
		this.name = name;
		this.roll = roll;
	}
	public Setsize() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}
	
	public static void main(String[] args) {
		Setsize s1 = new Setsize("Arif", "A23");
		Setsize s2 = new Setsize("Arif", "A24");
		Setsize s3 = new Setsize("Arif", "A25");
		Setsize s4 = new Setsize();
		s4.setName("arif");
		s4.getName();
		
		
		HashSet<Object> size = new HashSet<Object>();
		size.add(s1);
		size.add(s2);
		size.add(s3);
		size.add(s4);
		size.add("name");
		
		Iterator<Object> iterator  =size.iterator();
		System.out.println(size.size());
		System.out.println(size);
		while (iterator.hasNext()) {
		 //iterator.next();
		System.out.println(iterator.next());
		
		}
		
	}


}
