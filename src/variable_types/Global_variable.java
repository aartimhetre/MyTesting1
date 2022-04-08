package variable_types;

public class Global_variable {
	int a=10;//global non static variable
	static int b=20;//global static variable
	String name="Velocity";
	
	public static void main(String[] args) {
	System.out.println("value of b is "+b);//calling global static variable
	Global_variable gv=new Global_variable();//creating abject for non static method
	System.out.println("the value of a is "+gv.a);//calling global non static method
	gv.test();//calling non static method 
	test1();//calling static method
	

	}
public void test()
{
	System.out.println("My name is "+name);
	int c=10;//local variable
	int sum=c+a;//using global variable ading in local
	int sum1=c+b;//using global static variable adding in local
	System.out.println("addition ia sum "+sum);
	System.out.println("addition is sum1 "+sum1);
	//int sum1=c+d:we cant use local (d)variable from another method
}
public static void test1()
{
	//System.out.println("My name is "+name);
	int c=30;//local variable
	int d=40;//local variable
	int sub=d-b;//using global static variable adding in local
	//int sub1=d-a;we cant call nons tatic variable in static blocks
	System.out.println("substraction of sub is "+sub);
	int sub1=d-c;
	System.out.println("substraction of sub1 is "+sub1);
	}
}
