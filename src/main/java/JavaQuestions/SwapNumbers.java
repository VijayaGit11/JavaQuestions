package JavaQuestions;

public class SwapNumbers {

	public static void main(String[] args) {
		
		System.out.println("Before swapping:");
		int a=15;
		int b=78;
		
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is "+b);
		
//		System.out.println("After swapping:");
//		int temp=a;
//		a=b;
//		b=temp;
//		
//		System.out.println("Value of a is "+a);
//		System.out.println("Value of b is "+b);
		
		//Without temp var;
		
		a=a-b; 
		b=a+b;	
		a=b-a;	

		System.out.println("values after swap without temp variable:");
		System.out.println("value of a is "+a);
		System.out.println("value of b is "+b);
		

	}

}
