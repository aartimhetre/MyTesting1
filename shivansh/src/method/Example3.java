package method;

public class Example3 {

	public static void main(String[] args) {
	//Calling non-static method -->need to create object	
	//creating object
	Example3 e3=new Example3(); 
	//syntax to create object-->classname objectname=new classname();
	
	//to call non-static method
	//syntax-->objectname.methodname();
	e3.test1();  //calling nonstatic method from same class
	e3.test2();  //calling nonstatic method from same class
    Example4 e4=new Example4();
    e4.test4();  //calling nonstatic method from different class
	}
public void test1() //non static method-->becuz it dnt have static keyword
{
	System.out.println("Hi this is Non-static test1 method is running");
	}
public void test2() //non-static method
{
	System.out.println("Hi this is Non-static test2 method is running");
	}
}
