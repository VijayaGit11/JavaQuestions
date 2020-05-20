package JavaQuestions;

import java.util.Scanner;

public class NaturalNumberSumRecursion {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.print("User's value is ");
		int num = reader.nextInt();
		reader.close();
		
		int sum = addNum(num);
		System.out.println("sum is " + sum);
		
	}
	
	public static int addNum(int num) {
		
		if(num!=0) {
			return num + addNum(num-1);
		}
		return num;
		
	}

}
