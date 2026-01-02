package com.index;

public class Variableass4 {
	
	static String company = "Tesla"; //static variable
	String model;   //instance variable
	
	void details() {
		int speed = 200; //local variable
		System.out.println("Speed: "+speed);
		System.out.println("Model: "+model);
	}
	

	public static void main(String[] args) {
		System.out.println("Company: "+Variableass4.company);
		Variableass4 s1 = new Variableass4();
		s1.model = "Model s";
		s1.details();
	}

}
