package polymorphism;

public class Overloading_study {

	public static void main(String[] args) {
		Overloading_study o=new Overloading_study();
		o.add();
		o.add(100, 400);
		o.add(125.25f, 12.456f);

	}
public void add()
{
	int a=10;
	int b=20;
	int sum=a+b;
	System.out.println("the sum is "+sum);}
public void add(int a,int b)
{
	int sum=a+b;
	System.out.println("the sum is "+sum);}
public void add(float a,float b)
{
	float mul=a*b;
	System.out.println("the mul is "+mul);}
}
