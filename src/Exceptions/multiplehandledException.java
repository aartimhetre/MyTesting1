package Exceptions;

public class multiplehandledException {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		try {
		int div=a/b;
		System.out.println(div);
		} 
		catch (NullPointerException e) {
			System.out.println("can not perform actions on null value");
         }
		catch (ArithmeticException e) {
			System.out.println("can not divided by zero");
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("value of index is not in range");
		}
		
		
		finally {
			System.out.println("hi finally is executed");
		}

	}

}
