package this_use;

public class This_study {
int a=10;
static int b=20;
static int c=30;
	public static void main(String[] args) {
	This_study th1=new This_study();
	th1.sample();

	}
public void sample()
{
	int b=200;
	int a=100;
	int sum=100+a;
	System.out.println("sum is using local variable "+sum);
	int sum1=100+this.a;//by using global variable
	System.out.println("sum is using global variable "+sum1);
	int sub=1000-b;
	int sub1=1000-this.b;//by using global static variable
	System.out.println("sub is using local b"+sub);
	System.out.println("sub is using global b "+sub1);
	}
public static void test1()
{
	int c=50;
	int sum=100+c;
	//int sum1=100+this.c; we cant use this keyword in the static method}
}
}