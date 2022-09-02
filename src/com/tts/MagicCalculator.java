package com.tts;

public class MagicCalculator extends Calculator {
	
	private double squareRoot;
	private double sin;
	private double cosine;
	private double tangent;
	private double factorial;
	
	

	public static void setFactorial(Integer num1) {
		Integer i = 1;
		double factorial = 1;
		for (i = 1; i <= num1; i++) {    
		   factorial = num1 * i;
		       }
		System.out.println("The Factorial of number 1 is " + factorial);
	}

	public static void setTangent(Integer num1) {
		double Tangent = Math.tan(num1);
		System.out.println("The Tangent of number 1 is " + Tangent);
	}

	public static void setCosine(Integer num1) {
		double cosine = Math.cos(num1);
		System.out.println("The Cosine of number 1 is " + cosine);
	}

	public static void setSin(Integer num1) {
		double sin = Math.toRadians(num1);  
		System.out.println("The sin of number 1 is " + sin);
	}
		

	public static void setSquareRoot(Integer num1) {
		double squareRoot = Math.sqrt(num1);
		System.out.println("The Squareroot of number 1 is " + squareRoot);
	}
	

	@Override
	public String toString() {
		return "MagicCalculator [squareRoot=" + squareRoot + ", sin=" + sin + ", cosine=" + cosine + ", tangent="
				+ tangent + ", factorial=" + factorial + "]";
	}

	public MagicCalculator() {
		// TODO Auto-generated constructor stub
	}
}

