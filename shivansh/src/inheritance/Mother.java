package inheritance;
//creating supar/ parent /base class for single level inheritance
public class Mother extends Grandmother
{

	public void look()//non-static method
	{
		System.out.println("mothers look");
	}
	public void money()//nonstatic method
	{
		System.out.println("mothers money");
	}
	public static void addition()//static method
	{
		int a=10;//local variable
		int b=30;//local variable
		System.out.println("sum= "+(a+b));//addition of local variable
	}
	public void String()
	{
		String name="Aarti";
	    System.out.println("My name is "+name);
	}
	
}
