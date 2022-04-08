package daily_practice;

public class Methods1 {

	public static void main(String[] args) {
		addition();
	Methods1 s=new Methods1();
	s.substraction();
		

	}
	public static void addition()
	{
		int a=10;//local static variable
		int b=20;//local static variable
		int sum=a+b;
		int mul=a*b;
		int div=b/a;
		System.out.println("the value of sum is "+sum);
		System.out.println("the value of mul is "+mul);
		System.out.println("the value of div is "+div);
	}
public void substraction()
{
	String name="Aarti";
	float value=125.4568f;
	System.out.println("the name is "+name);
	System.out.println("the value is "+value);}
}
