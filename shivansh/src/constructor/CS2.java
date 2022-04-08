package constructor;

public class CS2 {

	public CS2()//this is user defined zero parameter constructor
	{
		System.out.println("Running zero parameter constructor");
	}

	public static void main(String[] args) 
	{
	CS2 c2=new CS2();//this is creating object
	c2.test1();
	

	}
public void test1() //this is nonstatic method 
{
	System.out.println("Non static test1 method");
	}
}
