package JavaQuestions;

public class CalculatePowerOfNum {

	public static void main(String[] args) {
		
		int base = 7;
		int exponent = 2;
//			OR
//		Scanner reader = new Scanner(System.in);
//		
//		System.out.print("Enter the root ");
		
//		int base = reader.nextInt();
//		int exponent = 4;
		int power = base;
		int count = 1;
		
		if(exponent!=0) {
		for(int i = 1; i<exponent; i++) {
			
			power = power*base; 	//16 4 9 27 81
			count++; 	//2 2 3 2 3 4
			
			}
			System.out.println("power of number is "+ power);
			System.out.println("power of "+ base + " by math function is " + Math.pow(base, exponent));
		}
			
		else {
			System.out.println(count);
		}

	}

}