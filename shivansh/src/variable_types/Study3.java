package variable_types;

public class Study3 {
 int a=20;//non static global variable
	public static void main(String[] args) {
		Study3 s3=new Study3();//creating object for same class
		s3.display1();//calling non static method from same class
		System.out.println("The value of a is "+s3.a);//calling non static variable from same class
		Study1 s4=new Study1();//creating object for different class
		System.out.println("The value of a is "+s4.a);//calling non-static variable from different class
		

	}
public void display1()
{
	int b=30;//local variable
	System.out.println("the value of a is "+a);//non static global variable
	System.out.println("the value of b is "+b);//local variable
	}

}
