package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("This program will take two number inputs and add them together");
		
		System.out.print("Enter the first number: ");
		double num1 = keyboard.nextDouble();
		
		System.out.print("Enter the second number: ");
		double num2 = keyboard.nextDouble();
		
		double sum = num1 + num2 + 2;
		
		System.out.print("The sum of the numbers you entered plus 2 is: " + sum);
		keyboard.close();
	}

}
