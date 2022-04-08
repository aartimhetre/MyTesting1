package constructor;

public class Test1 {

	public static void main(String[] args) 
	{
	
	Variable_call vc=new Variable_call();//created object of another class
	System.out.println("value of a is "+vc.a);//calling non static variable from another class
	System.out.println("value of b is "+Variable_call.b);//calling static variable from another class
	

	}

}
