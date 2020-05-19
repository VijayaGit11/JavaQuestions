package JavaQuestions;

import java.util.Scanner;

public class VowelAndConsonant {

	public static void main(String[] args) {

		// a  ei o  u
		
		char ch = 'u';
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u') {
			System.out.println(ch + " is Vowel");
		}
		else{
			System.out.println(ch + " is Consonant");
		}
	
	switch (ch) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
		System.out.println(ch +" is vowel");
		break;
	
		default:
			System.out.println(ch +" is onsonant");
		}
	}
}
