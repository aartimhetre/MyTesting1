package Exceptions;

public class NullpointException {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		try {
			
			int div=a/b;
			System.out.println(div);
		} 
		catch (NullPointerException e) 
		{
			System.out.println("cant perform actions on null values");
		}
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("check string index");
		}
		catch (ArithmeticException e) {
			System.out.println("cant divide by zero");
		}
		
//		finally {
//			System.out.println("hi finally is executed");
//		}

	}
}


