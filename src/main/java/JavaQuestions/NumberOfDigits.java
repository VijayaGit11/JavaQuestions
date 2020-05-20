package JavaQuestions;

import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) {
//		num = 1234	45623
		
//		int num = 125;
		int count = 0;
		
//		OR 
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Number of digits in ");
		int num = reader.nextInt();
		reader.close();
		
		while(num !=0) {
			num = num/10; //123 12 1 0	//4562	456	45	4 0
			count++;	//1 2 3	4		//1	2 3 4 5
		}
			System.out.println("Number of digit in this number are " + count);
	}

}