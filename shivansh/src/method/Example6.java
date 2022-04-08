package method;

public class Example6 {

	
	public static void main(String[] args) {
//calling non-static method-->need to create object
//creating object
Example6 e6=new Example6();	
//syntax to create object-->classname objectname=new classname();
//to call non-static method
//syntax-->objectname.methodname();
e6.test1();
e6.test2();


	}
	public void test1() //nonstatic method-->becuz dnt have static keyword
	{
		System.out.println("Hi this is non-static test1 method is running");
	}
public void test2() //nonstatic method --becuz dnt hav static kayword
{
	System.out.println("Hi this is non-static test2 method is running");
	}

}
