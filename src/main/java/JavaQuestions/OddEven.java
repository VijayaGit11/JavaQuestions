package JavaQuestions;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.print("Number entered by user is ");
		
		int num = reader.nextInt();
		reader.close();
		
		int Reminder = num%2;
		
		if(Reminder==0) {
			System.out.println(num +" is even even");
		}
		else {
			System.out.println(num +" is odd number");
		}
		
 

	}

}