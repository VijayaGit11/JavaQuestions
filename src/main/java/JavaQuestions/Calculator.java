package JavaQuestions;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter two numbers ");
		double num1 = reader.nextInt();
		double num2 = reader.nextInt();
		
		System.out.print("Please enter operator:(+, -, *, /) ");
		char operator = reader.next().charAt(0);
		
		double result = 0;
		reader.close();
		
		switch (operator) {
		case '+':
			result = num1+num2;			
			break;
		case '-':
			result = num1-num2;
			break;
		case '*':
			result = num1*num2;
			break;
		case '/':
			result = num1/num2;
			break;
		default:
			System.out.println("Please enter correct operator");
			break;
		}
		
		System.out.println("Result is " + result);

	}

}
