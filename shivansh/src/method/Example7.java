package method;

public class Example7 {

	public static void main(String[] args) {
		Example7 e7=new Example7();  //created object of a class
e7.demo1();// calling non-static method from same class

Example6 e6=new Example6();//created object of different class
e6.test1();//calling non static method from different class
e6.test2();//calling non static method from different class

	}
public void demo1()
{
	System.out.println("this is non static demo method");
	}
}
