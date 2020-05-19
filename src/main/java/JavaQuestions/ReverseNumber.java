 package JavaQuestions;

import java.util.Scanner;

public class ReverseNumber extends ReadConsoleValue{

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("User's value is ");
		int num = reader.nextInt();
		
//		OR
		
//		int num = 7856;
		int rev = 0;
		
		while(num!=0) {
			
			int n = num % 10; //4 2 1	//6	5 8	7
			rev = rev*10+n; //4 42 421	//6	65	658 6587
			num = num/10; //12 1 0	//785	78	7
			
		}
		
			System.out.println("Reverse is " + rev);
	}

}
