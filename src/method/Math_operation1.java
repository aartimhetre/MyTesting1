package method;

public class Math_operation1 {

	public void addition()
		{
	        int a=10;
			int b=20;
			int sum =a+b;
			System.out.println("Addition is "+sum);
			}	
		public static void main(String[] args) 
		{
			Math_operation1 m=new Math_operation1();   //created object
			m.addition(); //calling nonstatic method from same class
			substraction(); //calling static method from same class
			
	}
public static void substraction()
{
	int a=20;
	int b=10;
	int sub=a-b;
	System.out.println("substraction is "+sub);
	}

}
