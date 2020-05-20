package JavaQuestions;

public class PrimeNumberInterval {

	public static void main(String[] args) {
		
		int num1=3;
		int num2=50;
		
//		5 7 11
		while(num1<num2) {
			
			Boolean flag = false;
			
			for(int i=2; i<=num1/2; i++) {
			
			if(num1%i==0) {
				flag = true;
					break;
				}
			}
			
			if(!flag) {
				System.out.print(num1 + ", ");
			}
			
			num1++;
		}
	}
}