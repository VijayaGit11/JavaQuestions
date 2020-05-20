package JavaQuestions;

import java.util.Scanner;

public class FactorialRecursive {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.print("User's value is ");
		int num = reader.nextInt();
		reader.close();
		
		System.out.println("Factorial of " + num + " is " + getFact(num));

	}
	
	public static int getFact(int num) {
		
		if(num>=1) {
		return num * getFact(num-1);
		}
		else {
			return 1;
		}
		
	}

}
