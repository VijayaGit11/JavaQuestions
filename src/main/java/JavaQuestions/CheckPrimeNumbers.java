package JavaQuestions;

import java.util.Scanner;

public class CheckPrimeNumbers {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.print("User's value is ");
		int num = reader.nextInt();
		reader.close();
		
//		int num =34;
		
		boolean flag = true;
		
		//System.out.println(checkPrimeNumber(num));
		
		for (int i = 2; i<=num/2; i++) {
			
			if(checkPrimeNumber(i)) {
				if(checkPrimeNumber(num-i)) {
					System.out.println(num + " = "+ i + " + " + (num-i) );
					flag = true;
				}
			}
		}
		
		if(!flag) {
			System.out.println(num + " cannot be expressed as sum if two prime numbers");
		}
		
	}
	
	public static boolean checkPrimeNumber(int num) {
		
		boolean isPrime = true;
		for (int i=2 ; i<=num/2; i++ ) {
			if(num % i==0) {	//4/2
				isPrime = false;
				break;
			}
		}
		
		return isPrime;
		
	}

}
