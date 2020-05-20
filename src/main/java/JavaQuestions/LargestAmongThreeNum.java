package JavaQuestions;

public class LargestAmongThreeNum {

	public static void main(String[] args) {

		int x = 100;
		double y = 500.65d;
		int z= 780;
		
		if(x>y && x>z) {
				System.out.println("x is largest");
			}
		else if(y>z) {
				System.out.println("y is largest");	
		}
		else {
				System.out.println("z is Largest");
		}
	}

}