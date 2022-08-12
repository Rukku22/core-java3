package project4;

public class Exception5 {
	public static void validate(int age) {
		

		if(age<18) {
			throw new ArithmeticException("person is not elgible");
		}
		else {
			System.out.println("elgible to vote");
		}
	}
	public static void main(String args[]) {
		
		validate(19);
		
	}
	
	

}
