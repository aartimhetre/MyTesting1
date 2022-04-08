package method;

public class Example1 {

	public static void main(String[] args) {
		test1();//calling static method from same class
		Example2.test2();//calling static method from different class
		//syntax:classname.methodname();
		Example1.test1();//calling static method form same class
	
	}
public static void test1()
{
	System.out.println("Running static method from Ex1");
	}
}
