package method_study;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main method is running");
//main method
test1();
//to calling static regular method 
test2();
//to calling static regular method from the same class
System.out.println("main method is ending");

	}

	//public static void main(); //incomplete method,method declaration
	//it not contains body 
 public static void test1()
 {
	 System.out.println("running the static regular method-->test1");
 }
 //public static void main test1() //complete method,body of methods
 
public static void test2()
{
	System.out.println("running the static regular method-->test2");
}
}
