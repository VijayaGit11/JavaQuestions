package JavaQuestions;

import java.util.Scanner;

public class FiboncciSeries {

	public static void main(String[] args) {
		
//		0 1 1 2 3 5 8 13 21 34 ..
		
		int t1 = 0;
		int t2 = 1;
		//int num= 20;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Fibonacci Series upto: ");
		
		int num = reader.nextInt();
		
		for (int i=1; i<=num; i++) {
			
			System.out.print(t1 + " ");	//0  1 1 2 3 5 8
			int sum = t1 + t2;	//1 2 3	5 8 13 
			t1 = t2;	//1 1 2 3 5 8
			t2 = sum;	//1 2 3 5 8 13
			
			
		}

	}

}
