package method;

public class Example8 {

	public static void main(String[] args)
	{
	Example8 e8=new Example8();
	addition();
	addition1(10,20,30);
	addition1(300,200,400);
	e8.studentinfo1("Pranav Mhetre",20,'D',20.77F);
	e8.studentinfo1("Manoj Mhetre",03,'A',50.55f);
	e8.studentinfo1("Shivansh Mhetre",02,'A',10.5f);
	}
public static void addition()// static method without parameter
{
int a=10;
int b=20;
int sum=a+b;
System.out.println("the addition is "+sum);
}
public static void addition1(int a,int b,int c)//static method with parameter
{
	int add=a+b+c;
	System.out.println("the value of addition is "+add);
}
public void studentinfo()//nonstatic method without parameter or non parameterised

{
	String name="AARTI MHETRE";
	int Rollno= 26;
	char Grade= 'A';
	float weight=48.45f;
	System.out.println("==========================");
	System.out.println("Student name="+name);
	System.out.println("Stuent Roll number="+Rollno);
	System.out.println("Studnet grade="+Grade);
	System.out.println("Student weight="+weight);
	System.out.println("==========================");
	}
public void studentinfo1(String name,int Rollno,char Grade,float weight)
{ 
	System.out.println("==========================");
	System.out.println("Student name="+name);
	System.out.println("Stuent Roll number="+Rollno);
	System.out.println("Studnet grade=" +Grade);
	System.out.println("Student weight= "+weight);
	System.out.println("==========================");
	}
}
