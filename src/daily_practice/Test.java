package daily_practice;

public class Test {
int a=50;//global non static variable
static int b=40;//global static variable

	public static void main(String[] args) {
		Test t1=new Test();//created object for the non-static variable
		int sum=10+t1.a;
		System.out.println("Sum is "+sum);
		int mul=20*b;
		System.out.println("the mul is "+mul);
		int sub=t1.a-b;
		System.out.println("the value of sub is "+sub);
		

	}

}
