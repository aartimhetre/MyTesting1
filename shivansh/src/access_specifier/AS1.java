package access_specifier;

public class AS1 {
	int a=10;//default non static global variable
	public int b=20;//public non static global variable
	protected int c=30;//protected non static global variable
	private int d=40;//private non static global variable

	public static void main(String[] args) {
		AS1 as1=new AS1();//created object for calling non-static method
		as1.test1();//
		as1.test2();//
		as1.test3();//
		as1.test4();//
		System.out.println("Default global variable a is "+as1.a);//
		System.out.println("Public global variable is "+as1.b);//
		System.out.println("protected global variable is "+as1.c);//
		System.out.println("private global variable is "+as1.d);//
	}
void test1()
{
	System.out.println("Default test1 method from AS1 class");
	}
public void test2()
{
	System.out.println("public test2 method from AS1 class");
	}
protected void test3()
{
	System.out.println("protected test3 method from AS1 class");
	}
private void test4()
{
	System.out.println("private test4 method from AS1 class");
	}
}
