package JavaQuestions;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		
//		153 = 1*1*1+5*5*5+3*3*3
//		371 = 3*3*3+7*7*7+1*1*1
//		1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748
		
		Scanner reader = new Scanner(System.in);
		System.out.println("User's value is ");
		
		int num = reader.nextInt();
		
		int actualNum = num;
		int number = actualNum;
		double result = 0;
		
		int count = getCount(num);
		
		while(number != 0) {
			int n = number%10; //3 5 1
			result = result + Math.pow(n, count); //27+125+ 1 
		}
		
		System.out.println(result);
		
		if(result == actualNum) {
			System.out.println(actualNum + " is armstrong number");
		}
		else {
			System.out.println(actualNum + " is not armstrong number");
		}
		
	}
		
		public static int getCount(int num) {
			
			int count = 0;
			
			while(num !=0) {
				num = num/10; //15 1 0
				count++; //1 2 3
			}
		
			System.out.println(count);
			return count;
	}

}
