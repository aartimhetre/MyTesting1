package variable_types;

public class Study1 {
int a=10;//global variable non-static
static int b=20;//global static variable
	public static void main(String[] args) 
	{
	System.out.println("Value of b is "+b);//calling global static variable
	Study1 s1=new Study1();//calling object for non static method
	s1.test();
	System.out.println("the value of a is "+s1.a);//calling global non static variable
	test1();
	
	}
public void test()
{
	int c=10;//local variable
	int sum=c+a;//using global variable adding in local
	System.out.println("Addition is "+sum);//int sum1=a+d;-->we cant use local dvariable from another
	}
public static void test1()
{
	int d=40;//local variable
	int sub=d-b; //using global static variable in local
	System.out.println("substraction is "+sub);
	}
}
