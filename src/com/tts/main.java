package com.tts;

import java.util.Scanner;

public class main {
		public static void main (String [] args) {
			System.out.println("Hello!");
			Scanner input = new Scanner(System.in);
			System.out.println("What is your First number?");
			 Integer num1 = Integer.parseInt(input.nextLine());
			 System.out.println("What is your Second number?");
			 Integer num2 = Integer.parseInt(input.nextLine());
			 Calculator.add(num1, num2);
			 Calculator.subtract(num1, num2);
			 Calculator.multiply(num1, num2);
			 Calculator.divide(num1, num2);
			 Calculator.Square(num1);
			 MagicCalculator.setSquareRoot(num1);
				MagicCalculator.setCosine(num1);
				MagicCalculator.setSin(num1);
				MagicCalculator.setTangent(num1);
				MagicCalculator.setFactorial(num1);
		}

}
