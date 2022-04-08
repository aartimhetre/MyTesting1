package constructor;

public class Test2 {
	int a=50;
	int b=20;
    String name ="Name1";
	public Test2(int num1,int num2)
	{
		a=num1;
		b=num2;
	}
		public Test2(String Radha)
		{
		   name=Radha;

		
		System.out.println("====================");
	}
	
	public static void main(String[] args) {
  Test2 t1=new Test2(100,80);
  t1.addition();
  Test2 t2=new Test2(200,30);
  t2.substraction();
  Test2 t3=new Test2("Manoj");
  t3.display();
  
  }
public void addition()
{

	int sum=a+b;
	System.out.println("The value of sum is= "+sum);
	}
public void substraction()
{
	int sub=a-b;
	System.out.println("the value of sub is= "+sub);
	}
public void display()
{
	System.out.println("THE NAME IS = "+ name);
}
}
