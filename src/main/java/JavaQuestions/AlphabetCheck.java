package JavaQuestions;

public class AlphabetCheck {

	public static void main(String[] args) {
		
	char ch= 'Z';
		
		if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
			System.out.println(ch + " is Alphabet");
		}
		else {
			System.out.println(ch + " is special character");
		}

	}

}