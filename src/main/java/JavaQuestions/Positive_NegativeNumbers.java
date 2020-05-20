package JavaQuestions;

import java.util.Scanner;

public class Positive_NegativeNumbers {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Number entered by user ");
		double num = reader.nextInt();
		reader.close();
		
		if(num>0.0) {
			System.out.println(num + " is postive");
		}
		else if(num<0.0) {
			System.out.println(num + " is negative");
		}
		else {
			System.out.println(num + " is zero");
		}

	}

}