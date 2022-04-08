package constructor;

public class CS4 {
	int a;
	int b;
	int c;
public CS4()
	{
		a=100;
		b=200;
		c=300;
		System.out.println("running the zero parameter constructor");
		}
public CS4(int num1)
{
	a=num1;
	System.out.println("running the one parameter constructor");
	}
public CS4(int num1,int num2)
{
	a=num1;
	b=num2;
	System.out.println("running the two parameter constructor");
	}
public CS4(int num1,int num2,int num3)
{
	a=num1;
	b=num2;
	c=num3;
	System.out.println("running the three parameter constructor");
	}

	public static void main(String[] args) 
	{
	CS4 c0=new CS4();
	c0.addition1();
	CS4 c1=new CS4(200);
	c1.addition1();
	CS4 c2=new CS4(300,400);
	c2.addition1();
	CS4 c3=new CS4(100,300,400);
	c3.addition1();
	
	
	}	
		
 public void addition1()
{
	int sum=a+b+c;
	System.out.println("addition is "+sum);
	}
	

}
