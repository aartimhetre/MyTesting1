package Exceptions;

public class Arithmatic_exception {

	public static void main(String[] args) {
		int a=10;
		int b=0;
//		int div=a/b;
//		System.out.println(div);
		
		try {
			int div=a/b;
			System.out.println(div);
		} 
		catch (ArithmeticException e) {
			
			System.out.println("cannot divided by zero");
		}

	}

}
