package JavaQuestions;

public class FactorialOfNumber {

	public static void main(String[] args) {
		//	!5=5*4*3*2*1
		//	!=0
		
		int num = 4;
		getFactorial(num);

	}
	
	public static void getFactorial(int num) {
		
		int fact = 1;
		
		for(int i=1; i<=num; i++) {
		fact = fact * i; 
		}
		System.out.println("Factorial of "+num +" is "+fact);
	}

}
