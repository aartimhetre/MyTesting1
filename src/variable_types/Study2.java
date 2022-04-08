package variable_types;

public class Study2 {
static int a=40;//static global variable

	public static void main(String[] args) 
	{
Study2 s2=new Study2();//creating object for same class
s2.display();//calling non static method for same class
System.out.println("the value of a is "+a);//calling static global variable 
System.out.println("the value of b is "+Study1.b);//calling static variable from different class

	}
public void display()
{
	int b=30;//local variable
	System.out.println("the value of a is "+a);//static global variable
	System.out.println("the value of b is "+b);//local variable
	}
	
}
