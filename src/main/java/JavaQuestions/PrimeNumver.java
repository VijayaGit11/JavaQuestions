package JavaQuestions;

import java.util.Scanner;

public class PrimeNumver {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.print("User's value is ");
		int num = reader.nextInt();
		
		int actualNum = num;
		boolean flag = false;
		
		for (int i=2 ; i<=num/2; i++ ) {
			
			if(num%i==0) {
				flag = true;
				break;
			}
		}
		
		if(!flag){
			
			System.out.println(actualNum + "number is prime number");
		}
		else {
			System.out.println(actualNum + " is not prime number");
			}
		
		}
}
