package JavaQuestions;

import java.util.Scanner;

public class PollidromeNumber {

	public static void main(String[] args) {
		
		//121 4571 112211
		
		Scanner reader = new Scanner(System.in);
		System.out.print("User's value is ");
		int num = reader.nextInt();
		reader.close();
		
//        int num = 121;
		
        int actualNum = num;	
		int rev = 0;
		
		while(num!=0) {
			int n = num%10; //1 1 1	//1 7 5 4
			rev = rev*10+n;	//1 12	//1 17	175 1754
			num = num/10; //12 1	//457 45 4
			
		}
		if(actualNum == rev) {
		System.out.println("Revers of " +actualNum + " is " + rev + " and it is pallidrome number");
		}
		else {
			System.out.println("Revers of " +actualNum + " is " + rev + " and it is not pallidrome numbe");
		}

	}

}