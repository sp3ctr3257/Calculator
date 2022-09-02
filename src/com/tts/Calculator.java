package com.tts;

public class Calculator {
	
	protected static Integer num1;
	protected static Integer num2;
	
	public static void add(Integer num1, Integer num2) {
		Integer add = num1 + num2;
		System.out.println(add);
		
	}
	public static void subtract(Integer num1, Integer num2) {
		Integer subtract = num1 - num2;
		System.out.println(subtract);
		
	}
	public static void multiply(Integer num1, Integer num2) {
		Integer multiply = num1 * num2;
		System.out.println(multiply);
		
	}
	public static void divide(Integer num1, Integer num2) {
		Integer divide = num1 % num2;
		System.out.println(divide);
		
	}
	public static void Square(Integer num1) {
		Integer square = num1 * num1;
		System.out.println(square);
		
	}

}
