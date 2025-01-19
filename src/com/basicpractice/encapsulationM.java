package com.basicpractice;

//Encapsulation - Binding data to method

class AW
{
	private int rollno;
	private  String name;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		System.out.println("Roll no value change");  // maintain log file for safe guarding value 
		                                             // from log file get use details etc for safe data
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}

public class encapsulationM {


	public static void main(String[] args) {
		
		AW obj = new AW();
		//obj.name = "Mohit";
		
		obj.setRollno(3);
		obj.setName("Mohit");
		
		
		System.out.println(obj.getName());
		System.out.println(obj.getRollno());

	}

}
