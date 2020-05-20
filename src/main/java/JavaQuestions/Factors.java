package JavaQuestions;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		
//		6 ---> 1 2 3 6
//		12 ---> 1 2 3 4 6 12
		
//		int num = 25;
		
//		 OR
		
		Scanner reader = new Scanner(System.in);
		System.out.print("User's value ");
		int num = reader.nextInt();
		reader.close();
		
		System.out.print("Factor's of " + num + ": ");
		
		for(int i = 1; i<=num/2; i++) {
			
			int factor = num%i;	//0
			
			if(factor == 0) {
				
				System.out.print(i + " ");
				
			}
		}

	}

}
