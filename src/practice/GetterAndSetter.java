package practice;

import java.util.Set;

public class GetterAndSetter {
	int roll; 
	String name;
	
	
	public void setValue(int roll, String name) {
		this.roll = roll;
		this.name = name;	
		System.out.println(roll +" "+name);
	}
	
	public static void main(String [] args) {
		GetterAndSetter value = new GetterAndSetter();
		value.getRoll();
		value.getName();
		System.out.println(value.roll+ " " + value.name);	
		value.setValue(111, "kazi");// way to describe
	}	
	
	public int getRoll() {
		return roll= 9;
	}
//	public void setRoll(int roll) {
//		this.roll = roll;
//	}
	public String getName() {
		return name= "Arif";
	}
//	public void setName(String name) {
//		this.name = name;
//	}
}
